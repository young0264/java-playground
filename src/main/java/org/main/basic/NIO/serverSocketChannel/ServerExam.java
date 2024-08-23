package org.main.basic.NIO.serverSocketChannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerExam {
    public static void main(String[] args) {
        ServerSocketChannel serverSocketChannel = null;

        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(true);
            serverSocketChannel.bind(new InetSocketAddress(5001));

            while (true) {
                System.out.println("[연결 기다림]");

                /** 연결 수락 */
                SocketChannel socketChannel = serverSocketChannel.accept();

                /** InetSocketAddress 로 hostname 받기 */
                InetSocketAddress localAddress = (InetSocketAddress) socketChannel.getLocalAddress();
                InetSocketAddress remoteAddress = (InetSocketAddress) socketChannel.getRemoteAddress();
                System.out.println("[연결 수락함] 로컬1: " + localAddress.getHostName());
                System.out.println("[연결 수락함] 로컬2: " + localAddress.getAddress());
                System.out.println("[연결 수락함] remote1: " + remoteAddress.getHostName());
                System.out.println("[연결 수락함] remote2: " + remoteAddress.getAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** 만약 server socket channel이 open일 때 */
        if (serverSocketChannel.isOpen()) {
            try {
                serverSocketChannel.close();
            } catch (IOException e) {}
        }
    }

}
