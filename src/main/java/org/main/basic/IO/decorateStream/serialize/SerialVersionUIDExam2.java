package org.main.basic.IO.decorateStream.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExam2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/young/project/java-playground/file5.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassC classC = (ClassC) ois.readObject();
        System.out.println("=========================");
        System.out.println("field1: " + classC.field1);
        System.out.println("field2: " + classC.field2);
    }
}
