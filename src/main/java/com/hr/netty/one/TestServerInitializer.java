package com.hr.netty.one;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;


/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/2/2718:12
 * @copyright {@link www.hndfsj.com}
 */
public class TestServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline=ch.pipeline();
        pipeline.addLast("httpServerCodeC",new HttpServerCodec());
        pipeline.addLast("testHttpServerHandler",new TestHttpServerHanlder());
    }
}
