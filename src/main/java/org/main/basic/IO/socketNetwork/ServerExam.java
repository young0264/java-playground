package org.main.basic.IO.socketNetwork;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Selector;

public class ServerExam {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));

        System.out.println("[연결 기다림]");

        while(true) {
            try {
                Socket socket = serverSocket.accept(); // 클라이언트 연결 수락

                InputStream inputStream = socket.getInputStream();

                byte[] bytes = new byte[1000];
                int readByteCount = -1;

                inputStream.read(bytes, 0, 100);
                String fileName = new String(bytes, 0, 100, "UTF-8");
                fileName = fileName.trim();

                System.out.println("[fileName]::" + fileName);
                FileOutputStream fileOutputStream = new FileOutputStream("/Users/young/study/subPackage/" + fileName);

                while((readByteCount=inputStream.read(bytes))!=-1) {
                    fileOutputStream.write(bytes, 0, readByteCount);
                }
                fileOutputStream.flush();
                System.out.println("[fileName]");

                fileOutputStream.close();
                inputStream.close();
                socket.close();
            } catch(Exception e) {
                break;
            }
        }

        serverSocket.close();
        System.out.println("[fileName]");
    }
}
