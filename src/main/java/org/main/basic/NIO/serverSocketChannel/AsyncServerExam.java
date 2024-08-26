//package org.main.basic.NIO.serverSocketChannel;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//import java.nio.channels.AsynchronousSocketChannel;
//import java.nio.channels.CompletionHandler;
//import java.nio.channels.ServerSocketChannel;
//
//public class AsyncServerExam {
//    void startServer() throws IOException {
//        ServerSocketChannel serverChannel = ServerSocketChannel.open();
//        serverChannel.bind(new InetSocketAddress(8080));
//
//        // 첫 번째 클라이언트 연결 대기
//        serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
//            @Override
//            public void completed(AsynchronousSocketChannel clientChannel, Void attachment) {
//                // 새로운 클라이언트 연결 처리
//                handleClient(clientChannel);
//
//                // 다음 클라이언트 연결 대기 (이 부분이 재귀가 아님)
//                serverChannel.accept(null, this);
//            }
//
//            @Override
//            public void failed(Throwable exc, Void attachment) {
//                exc.printStackTrace();
//            }
//        });
//    }
//
//    void handleClient(AsynchronousSocketChannel clientChannel) {
//        // 클라이언트 처리 로직
//    }
//
//}
