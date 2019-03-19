package com.daily.code.dailycode.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * socket发送缓冲区测试
 * 结果：数据同步拷贝到发送缓冲区后系统调用就结束了，只有发送缓冲区满了才阻塞
 */
public interface SocketTest {
    default void show() {
        System.out.println("hah");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("192.168.10.33", 8000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("dddddddddddddddddddddbc".getBytes());
        InputStream inputStream = socket.getInputStream();
        TimeUnit.SECONDS.sleep(5);
        while (true) {
            inputStream.read();
        }
    }
}
