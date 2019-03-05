package com.hr.netty.proto.server;

import com.hr.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/3/516:18
 * @copyright {@link www.hndfsj.com}
 */
public class TestHandler extends SimpleChannelInboundHandler<DataInfo.Student>{
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {
        System.out.println(msg.getAddress());
        System.out.println(msg.getName());
        System.out.println(msg.getAge());
    }
}
