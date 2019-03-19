package com.daily.code.dailycode.http.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;

public class HttpRequest {
    public static void main(String[] args) throws IOException {
        SelectorProvider provider = SelectorProvider.provider();
        AbstractSelector selector = provider.openSelector();
        ServerSocketChannel serverSocketChannel = provider.openServerSocketChannel();
        serverSocketChannel.bind(new InetSocketAddress(2000), 1024);
        serverSocketChannel.configureBlocking(false);
        SelectionKey serverKey = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            int select = selector.select(2000);
            System.out.println(selector.keys().size());
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isValid()) {
                    if (key.isAcceptable()) {
                        ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) key.channel();
                        System.out.println(serverSocketChannel == serverSocketChannel1);
                        SocketChannel childChannel = serverSocketChannel1.accept();
                        if(childChannel == null) continue;
                        childChannel.configureBlocking(false);
                        SelectionKey register = childChannel.register(selector, SelectionKey.OP_READ);
                        register.attach(ByteBuffer.allocateDirect(1024));
                    }
                    if (key.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        ByteBuffer buffer = (ByteBuffer) key.attachment();
                        socketChannel.read(buffer);
                        buffer.get(0);
                        // buffer.flip();
                        // byte[] bytes = new byte[buffer.remaining()];
                        //
                        // buffer.get(bytes);
                        // String s = new String(bytes);
                        System.out.println(buffer.capacity() + ", " + buffer.position());

                        // buffer.flip();
                        //
                        // socketChannel.close();

                    }
                }


            }
        }

    }
}
