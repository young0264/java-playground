package org.main.basic.IO.decorateStream.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExam {
    public static void main(String[] args) throws Exception {

        /** 출력 */
        FileOutputStream fos = new FileOutputStream("/Users/young/project/java-playground/file6.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Child child = new Child();
        child.field1 = "홍길동";
        child.field2 = "홍삼원";
        oos.writeObject(child);
        oos.flush(); oos.close(); fos.close();

        /** 입력 */
        FileInputStream fis = new FileInputStream("/Users/young/project/java-playground/file6.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Child v = (Child) ois.readObject();
        System.out.println("field1: " + v.field1);
        System.out.println("field2: " + v.field2);
        ois.close(); fis.close();
    }
}
