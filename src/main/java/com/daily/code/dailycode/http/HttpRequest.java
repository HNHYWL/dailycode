package com.daily.code.dailycode.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * 简单的http解析
 */
public class HttpRequest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        HashMap<String, String> requestMap = new HashMap<>();

        byte[] bytes = new byte[1024];
        int byteLength = inputStream.read(bytes);


        int start = 0;
        for (int i = 0; i < byteLength; i++) {
            if (bytes[i] == '\n' && bytes[i-1] == '\r') {
                String headLine = new String(bytes, start, i - 1-start);
                if (headLine.length() == 0) {
                    break;
                }
                System.out.println(headLine);
                start = i + 1;

                String[] strings = headLine.split(":", 1);
                if (strings.length < 2) {
                    requestMap.put("head", headLine);
                }else {
                    requestMap.put(strings[0], strings[1]);
                }
            }
        }

        OutputStream outputStream = socket.getOutputStream();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body><h1>hello world</h1></body></html>");
        outputStream.write(stringBuilder.toString().getBytes());
        socket.close();


    }
}
