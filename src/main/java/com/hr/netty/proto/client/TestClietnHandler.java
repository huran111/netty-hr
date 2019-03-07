package com.hr.netty.proto.client;

import com.hr.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Random;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/3/516:24
 */
public class TestClietnHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randon = new Random().nextInt(3);
        randon=2;
        DataInfo.MyMessage myMessage;
        if (0 == randon) {
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.PersonType)
                    .setPerson(DataInfo.Person.newBuilder().setAge(1).setName("Person")).build();

        } else if (1 == randon) {
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.StudentTpye)
                    .setStudent(DataInfo.Student.newBuilder().setAge(1)
                            .setAddress("Student add").setName("address hr ")).build();
        } else {
            myMessage = DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.DogType)
                    .setDog(DataInfo.dog.newBuilder().setAge(323).setName("dog")).build();
        }
        ctx.channel().writeAndFlush(myMessage);
    }
}
