package org.main.basic.IO.decorateStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamReaderExam {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/young/project/java-playground/file.txt");
        Writer writer = new OutputStreamWriter(os);

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환.. 데이터 입력!";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다.");
    }
}
