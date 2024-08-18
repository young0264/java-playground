package org.main.basic.IO.decorateStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExam {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/young/project/java-playground/file3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /** fixed using auto-boxing in JAVA 5*/
//        oos.writeInt(10);
        oos.writeObject(10);
        oos.writeObject(3.14);
        oos.writeObject(new int[] { 1, 2, 3 });
        oos.writeObject(new String("홍길동"));

        oos.flush();	oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("/Users/young/project/java-playground/file3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

//        Integer obj1 = (Integer) ois.readInt();
        Integer obj1 = (Integer) ois.readObject();
        Double obj2 = (Double) ois.readObject();
        int[] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close(); fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
        System.out.println(obj4);
    }
}
