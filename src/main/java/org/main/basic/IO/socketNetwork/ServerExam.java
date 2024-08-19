package org.main.basic.IO.socketNetwork;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));

        System.out.println("[연결 기다림]");

        while(true) {
            try {
                Socket socket = serverSocket.accept(); // 클라이언트 연결 수락

                InputStream is = socket.getInputStream();

                byte[] bytes = new byte[1000];
                int readByteCount = -1;

                is.read(bytes, 0, 100);
                String fileName = new String(bytes, 0, 100, "UTF-8");
                fileName = fileName.trim();

                System.out.println("[fileName]" + fileName);
                FileOutputStream fos = new FileOutputStream("C:/Temp/" + fileName);
                while((readByteCount=is.read(bytes))!=-1) {
                    fos.write(bytes, 0, readByteCount);
                }
                fos.flush();
                System.out.println("[fileName]");

                fos.close();
                is.close();
                socket.close();
            } catch(Exception e) {
                break;
            }
        }

        serverSocket.close();
        System.out.println("[fileName]]");
    }
}
