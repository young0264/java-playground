package org.main.basic.IO.decorateStream.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExam1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/young/project/java-playground/file5.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassC classC = new ClassC();
        classC.field1 = 1;
        classC.field2 = 22;
        oos.writeObject(classC);
        oos.flush();	oos.close();  fos.close();
    }
}
