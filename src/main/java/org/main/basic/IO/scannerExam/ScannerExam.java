package org.main.basic.IO.scannerExam;

import java.util.Optional;
import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력> ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);
        System.out.println();

        System.out.print("정수 입력> ");
        Integer inputInt =
                Optional.ofNullable(getInput(scanner))
                        .orElseThrow(() -> {
                            System.out.printf("=================");
                            System.out.printf("정수만 입력 가능합니다.");
                            return new IllegalArgumentException("정수만 입력 가능합니다.");
        });
        System.out.println(inputInt);
        System.out.println();

        System.out.print("실수 입력> ");
        double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);
    }

    private static Integer getInput(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return null; // 예외가 발생하면 null을 반환
        }
    }
}
