package org.main.basic.IO;

import java.io.InputStream;

public class SystemExam2 {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        byte[] data = new byte[100];

        System.out.println("data length : "+ data.length);
        System.out.print("이름: ");
        int nameBytes = is.read(data);
//        String name = new String(data, 0, nameBytes-2);
        String name = new String(data, 0, nameBytes);

        System.out.print("하고 싶은말: ");
        int commentBytes = is.read(data);
//        String comment = new String(data, 0, commentBytes-2);
        String comment = new String(data, 0, commentBytes);

        System.out.println("입력한 '이름': " + name);
        System.out.println("입력한 '하고 싶은말': " + comment);
    }
}
