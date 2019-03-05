package com.hr.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author 胡冉
 * @Description: 测试类
 * @date 2019/3/515:47
 */
public class ProtoBufTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setAddress("北京").setName("哗然").setAge(20).build();
        byte[] bytes = student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(bytes);
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
    }
}
