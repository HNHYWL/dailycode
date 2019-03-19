package com.daily.code.dailycode.netty.server;



import com.daily.code.dailycode.netty.protocol.Request;
import com.daily.code.dailycode.netty.protocol.Response;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws InterruptedException {
        NioEventLoopGroup boss = new NioEventLoopGroup();
        NioEventLoopGroup worker = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap()
                .group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .localAddress(8990)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline()
                                .addLast(new ProtobufVarint32FrameDecoder())
                                .addLast(new ProtobufDecoder(Request.CIMReqProtocol.getDefaultInstance()))
                                .addLast(new ProtobufVarint32LengthFieldPrepender())
                                .addLast(new ProtobufEncoder()).addLast(new ServerHandler());
                    }
                });

        ChannelFuture future = serverBootstrap.bind().sync();
        if (future.isSuccess()) {
            System.out.println("启动 cim server 成功");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            if(ServerHandler.channelSet.isEmpty()) continue;
            Channel o = (Channel)ServerHandler.channelSet.toArray()[0];

            System.out.println(o.getClass()+"+++++++");
            // System.out.println(future.channel().getClass());

            // Channel channel = future.channel();
            String s = scanner.nextLine();

            Response.CIMResProtocol world = Response.CIMResProtocol.newBuilder()
                    .setType(9)
                    .setResMsg(s)
                    .setResponseId(908L)
                    .build();
            o.writeAndFlush(world);
        }
    }
}
