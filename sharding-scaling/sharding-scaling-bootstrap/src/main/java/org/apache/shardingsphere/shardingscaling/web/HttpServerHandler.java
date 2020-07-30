/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingscaling.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.shardingscaling.core.ShardingScalingJob;
import org.apache.shardingsphere.shardingscaling.core.config.ScalingConfiguration;
import org.apache.shardingsphere.shardingscaling.core.config.SyncConfiguration;
import org.apache.shardingsphere.shardingscaling.core.config.utils.SyncConfigurationUtil;
import org.apache.shardingsphere.shardingscaling.core.controller.ScalingJobController;
import org.apache.shardingsphere.shardingscaling.core.controller.SyncProgress;
import org.apache.shardingsphere.shardingscaling.core.datasource.DataSourceManager;
import org.apache.shardingsphere.shardingscaling.core.exception.DatasourceCheckFailedException;
import org.apache.shardingsphere.shardingscaling.core.exception.ScalingJobNotFoundException;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.checker.DataSourceChecker;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.checker.DataSourceCheckerCheckerFactory;
import org.apache.shardingsphere.shardingscaling.utils.ResponseContentUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Http server handler.
 */
@Slf4j
public final class HttpServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    
    private static final Pattern URL_PATTERN = Pattern.compile("(^/shardingscaling/job/(start|stop|list))|(^/shardingscaling/job/progress/\\d+)", Pattern.CASE_INSENSITIVE);
    
    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
    
    private static final ScalingJobController SCALING_JOB_CONTROLLER = new ScalingJobController();
    
    @Override
    protected void channelRead0(final ChannelHandlerContext channelHandlerContext, final FullHttpRequest request) {
        String requestPath = request.uri();
        String requestBody = request.content().toString(CharsetUtil.UTF_8);
        HttpMethod method = request.method();
        if (!URL_PATTERN.matcher(requestPath).matches()) {
            response(GSON.toJson(ResponseContentUtil.handleBadRequest("Not support request!")),
                    channelHandlerContext, HttpResponseStatus.BAD_REQUEST);
            return;
        }
        if ("/shardingscaling/job/start".equalsIgnoreCase(requestPath) && method.equals(HttpMethod.POST)) {
            startJob(channelHandlerContext, requestBody);
            return;
        }
        if (requestPath.contains("/shardingscaling/job/progress/") && method.equals(HttpMethod.GET)) {
            getJobProgress(channelHandlerContext, requestPath);
            return;
        }
        if ("/shardingscaling/job/list".equalsIgnoreCase(requestPath) && method.equals(HttpMethod.GET)) {
            listAllJobs(channelHandlerContext);
            return;
        }
        if ("/shardingscaling/job/stop".equalsIgnoreCase(requestPath) && method.equals(HttpMethod.POST)) {
            stopJob(channelHandlerContext, requestBody);
            return;
        }
        response(GSON.toJson(ResponseContentUtil.handleBadRequest("Not support request!")),
                channelHandlerContext, HttpResponseStatus.BAD_REQUEST);
    }
    
    private void startJob(final ChannelHandlerContext channelHandlerContext, final String requestBody) {
        ScalingConfiguration scalingConfiguration = GSON.fromJson(requestBody, ScalingConfiguration.class);
        ShardingScalingJob shardingScalingJob = new ShardingScalingJob("Local Sharding Scaling Job");
        shardingScalingJob.getSyncConfigurations().addAll(SyncConfigurationUtil.toSyncConfigurations(scalingConfiguration));
        DataSourceManager dataSourceManager = new DataSourceManager(shardingScalingJob.getSyncConfigurations());
        try {
            checkDatasources(shardingScalingJob.getSyncConfigurations(), dataSourceManager);
        } catch (DatasourceCheckFailedException e) {
            log.warn("Datasources check failed!", e);
            response(GSON.toJson(ResponseContentUtil.handleBadRequest(e.getMessage())), channelHandlerContext, HttpResponseStatus.BAD_REQUEST);
            return;
        }
        log.info("start job : {}", requestBody);
        SCALING_JOB_CONTROLLER.start(shardingScalingJob);
        response(GSON.toJson(ResponseContentUtil.success()), channelHandlerContext, HttpResponseStatus.OK);
    }
    
    private void checkDatasources(final List<SyncConfiguration> syncConfigurations, final DataSourceManager dataSourceManager) {
        try {
            DataSourceChecker dataSourceChecker = DataSourceCheckerCheckerFactory.newInstanceDataSourceChecker(
                    syncConfigurations.get(0).getReaderConfiguration().getDataSourceConfiguration().getDatabaseType().getName());
            dataSourceChecker.checkConnection(new ArrayList<>(dataSourceManager.getCachedDataSources().values()));
            dataSourceChecker.checkPrivilege(new ArrayList<>(dataSourceManager.getSourceDatasources().values()));
        } finally {
            dataSourceManager.close();
        }
    }
    
    private void getJobProgress(final ChannelHandlerContext channelHandlerContext, final String requestPath) {
        int jobId = Integer.parseInt(requestPath.split("/")[4]);
        try {
            SyncProgress progresses = SCALING_JOB_CONTROLLER.getProgresses(jobId);
            response(GSON.toJson(ResponseContentUtil.build(progresses)), channelHandlerContext, HttpResponseStatus.OK);
        } catch (ScalingJobNotFoundException e) {
            response(GSON.toJson(ResponseContentUtil.handleBadRequest(e.getMessage())), channelHandlerContext, HttpResponseStatus.BAD_REQUEST);
        }
    }
    
    private void listAllJobs(final ChannelHandlerContext channelHandlerContext) {
        List<ShardingScalingJob> shardingScalingJobs = SCALING_JOB_CONTROLLER.listShardingScalingJobs();
        response(GSON.toJson(ResponseContentUtil.build(shardingScalingJobs)), channelHandlerContext, HttpResponseStatus.OK);
    }
    
    private void stopJob(final ChannelHandlerContext channelHandlerContext, final String requestBody) {
        ShardingScalingJob shardingScalingJob = GSON.fromJson(requestBody, ShardingScalingJob.class);
        //TODO, Exception handling
        SCALING_JOB_CONTROLLER.stop(shardingScalingJob.getJobId());
        response(GSON.toJson(ResponseContentUtil.success()), channelHandlerContext, HttpResponseStatus.OK);
    }
    
    private void response(final String content, final ChannelHandlerContext ctx, final HttpResponseStatus status) {
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, status, Unpooled.copiedBuffer(content, CharsetUtil.UTF_8));
        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain;charset=UTF-8");
        HttpUtil.setContentLength(response, response.content().readableBytes());
        response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        ctx.writeAndFlush(response);
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) {
        log.warn("Http request handle occur error:", cause);
        response(GSON.toJson(ResponseContentUtil.handleException(cause.toString())), ctx, HttpResponseStatus.INTERNAL_SERVER_ERROR);
        ctx.close();
    }
}
