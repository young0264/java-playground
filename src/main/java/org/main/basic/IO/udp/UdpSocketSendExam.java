package org.main.basic.IO.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSocketSendExam {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        System.out.println("발신 시작");

        for (int i = 0; i < 3; i++) {
            String data = "메시지.." + i + "..sender에서 데이터를 보냅니다.";
            byte[] byteArr = data.getBytes("UTF-8");
            DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));

            datagramSocket.send(packet);
            System.out.println("보낸 바이트수 : " + byteArr.length + " bytes");
        }
        System.out.println("발신 종료");
        datagramSocket.close();

    }
}
