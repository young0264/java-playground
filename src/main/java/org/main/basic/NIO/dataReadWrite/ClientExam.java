package org.main.basic.NIO.dataReadWrite;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

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

            ByteBuffer byteBuffer = null;
            Charset charset = Charset.forName("UTF-8");

            // C->S Data Transport

            ByteBuffer byteBuffer1 = charset.encode("Hello Server. I'm Client1");
            ByteBuffer byteBuffer2 = charset.encode("Hello Server. I'm Client2");
            ByteBuffer byteBuffer3 = charset.encode("Hello Server. I'm Client3");
            socketChannel.write(byteBuffer1);
            socketChannel.write(byteBuffer2);
            socketChannel.write(byteBuffer3);
            System.out.println("[데이터 보내기 성공]");

            // Server로부터 받은 데이터 처리
            byteBuffer = ByteBuffer.allocate(100);
            int byteCount = socketChannel.read(byteBuffer); // 데이터 받기
            byteBuffer.flip(); // 읽기 모드로 전환
            String message = charset.decode(byteBuffer).toString(); // 받은 데이터 문자열로 변환
            System.out.println("[데이터 받기 성공] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (socketChannel.isOpen()) {
            System.out.println("client socket close");
            try {
                socketChannel.close();
            } catch (IOException e) {}
        }
    }
}
