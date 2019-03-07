package com.hr.netty.proto.server;

import com.hr.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/3/516:18
 */
public class TestHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyMessage msg) throws Exception {
        DataInfo.MyMessage.DataType dataType = msg.getDataType();
        if (dataType == DataInfo.MyMessage.DataType.PersonType) {
            DataInfo.Person person = msg.getPerson();
            System.out.println(person.getAge());
            System.out.println(person.getName());
        } else if (dataType == DataInfo.MyMessage.DataType.DogType) {
            System.out.println(msg.getDog().getAge());
            System.out.println(msg.getDog().getName());
        } else {
            System.out.println(msg.getStudent().getAge());
            System.out.println(msg.getStudent().getName());
            System.out.println(msg.getStudent().getAddress());

        }
    }
}
