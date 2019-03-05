package com.hr.netty.two.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.UUID;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/2/289:49
 */
public class MyServerHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("远程地址:" + ctx.channel().remoteAddress() + "," + msg);
        ctx.channel().writeAndFlush("form server" + UUID.randomUUID());

    }

    /***
     * 出现了异常
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.channel().close();
    }
}
