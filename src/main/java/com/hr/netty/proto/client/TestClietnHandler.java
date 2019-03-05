package com.hr.netty.proto.client;

import com.hr.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/3/516:24
 * @copyright {@link www.hndfsj.com}
 */
public class TestClietnHandler extends SimpleChannelInboundHandler<DataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        DataInfo.Student student = DataInfo.Student.newBuilder().setAge(23).setAddress("Neko")
                .setName("哗然").build();
        ctx.channel().writeAndFlush(student);
    }
}
