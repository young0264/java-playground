package org.main.basic.IO.decorateStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/young/project/java-playground/file3.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("[프린터 보조 스트림]");
        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼 ");
        ps.println("데이터를 출력합니다.");
        ps.println(123);
        ps.println(3.14);

        ps.flush();
        ps.close();
        fos.close();
    }
}
