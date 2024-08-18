package org.main.basic.IO.decorateStream.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/young/project/java-playground/file4.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassA classA = (ClassA) ois.readObject();

        System.out.println("field1: " + classA.field1);
        System.out.println("field2.field1: " + classA.field2.field1);
        System.out.println("field3: " + classA.field3);
        System.out.println("field4: " + classA.field4);
    }
}
