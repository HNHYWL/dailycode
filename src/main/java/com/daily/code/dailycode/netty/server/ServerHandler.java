package com.daily.code.dailycode.netty.server;

import com.daily.code.dailycode.netty.protocol.Request;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.HashSet;
import java.util.Set;

public class ServerHandler extends SimpleChannelInboundHandler {

    public static final Set<Channel> channelSet = new HashSet<>();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {

        Request.CIMReqProtocol msg1 = (Request.CIMReqProtocol) msg;
        System.out.println(msg1.toString());


        // // ByteBuf byteBuf = (ByteBuf) msg;
        // // int i = byteBuf.readableBytes();
        // // System.out.println(Utils.getString(byteBuf));
        // // ByteBuf buffer = Unpooled.buffer();
        // // buffer.writeBytes(("abcde" ).getBytes());
        // // ctx.writeAndFlush(buffer);
        //
        // Response.CIMResProtocol world = Response.CIMResProtocol.newBuilder()
        //         .setType(9)
        //         .setResMsg("world")
        //         .setResponseId(908L)
        //         .build();
        // ctx.writeAndFlush(world);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("complete");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("active\n");
        Channel channel = ctx.channel();
        channelSet.add(channel);
        System.out.println(channel.getClass());
    }


    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("not active!");
    }
}
