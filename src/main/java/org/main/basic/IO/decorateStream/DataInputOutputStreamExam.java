package org.main.basic.IO.decorateStream;

import java.io.*;

public class DataInputOutputStreamExam {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/young/project/java-playground/file3.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/young/project/java-playground/file3.txt");
        DataInputStream dis = new DataInputStream(fis);

        /** 일반적인 line 별로 데이터를 읽을 때 */
//        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

        /** UTF, double, int 순으로 데이터를 읽을 때 */
        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close();
        fis.close();
    }
}
