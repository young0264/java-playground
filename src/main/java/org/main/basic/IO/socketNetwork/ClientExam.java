package org.main.basic.IO.socketNetwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientExam {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5001);
        OutputStream os = socket.getOutputStream();

        String filePath = "/Users/young/study/file1.txt";
        File file = new File(filePath);

        String fileName = file.getName();
        byte[] fileNameBytes = fileName.getBytes("UTF-8");
        fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
        os.write(fileNameBytes);

        System.out.println("[fileName] " + fileName);
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1000];
        int readByteCount = -1;
        while((readByteCount=fis.read(bytes))!=-1) {
            System.out.println("readByteCount : " + readByteCount);
            os.write(bytes, 0, readByteCount);
        }

        os.flush();
        System.out.println("[fileName]");

        fis.close();
        os.close();
        socket.close();
    }
}
