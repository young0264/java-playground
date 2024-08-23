package org.main.basic.NIO.serverSocketChannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ClientExam {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;

        try {
            socketChannel = SocketChannel.open();

            /** 블로킹 방식 */
            socketChannel.configureBlocking(true);

            System.out.println("[연결 요청]");
            socketChannel.connect(new InetSocketAddress("localhost", 5001)); // 연결될 때까지 블로킹되는 시점
            System.out.println("[연결 성공]");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (socketChannel.isOpen()) {
            try {
                socketChannel.close();
            } catch (IOException e) {}
        }
    }
}
