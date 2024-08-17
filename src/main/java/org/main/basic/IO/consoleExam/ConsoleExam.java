package org.main.basic.IO.consoleExam;

import java.io.Console;

/** ConsoleExam 클래스 패키지가 시작하는 bin으로 이동 후 java 명령어 실행 */
public class ConsoleExam {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("아이디: ");
        String id = console.readLine();
        System.out.print("id: " + id);

        System.out.print("패스워드: ");
        char[] charPass = console.readPassword();
        String strPassword = new String(charPass);


        System.out.println("---------------------");
        System.out.println(id);
        System.out.println(strPassword);
    }
}
