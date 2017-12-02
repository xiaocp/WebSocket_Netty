package com.java.core.netty.websocket.common.protocols;

import com.alibaba.fastjson.JSONObject;
import com.java.core.netty.websocket.annotation.WSProtocol;
import com.java.core.netty.websocket.protocol.AbstractProtocolHandler;
import io.netty.channel.ChannelHandlerContext;

import java.util.Map;

/**
 * Created by zhuangjiesen on 2017/11/16.
 */
@WSProtocol( protocol = "location" )
public class LocationProtocolHandler  extends AbstractProtocolHandler {

    @Override
    protected String handlePushedMessage(Map<String, Object> params) {
        return JSONObject.toJSONString(params);
    }

    @Override
    protected void handleRecievedMessage(ChannelHandlerContext ctx, JSONObject message) {
        System.out.println();
    }

}