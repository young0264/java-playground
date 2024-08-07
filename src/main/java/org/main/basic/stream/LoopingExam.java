package org.main.basic.stream;

import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 8};

        System.out.println("peek(중간 처리 메서드)를 마지막에 호출한 경우");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n)); // 동작하지 않음
        System.out.println("\n");

        System.out.println("최종 처리 메서드를 마지막에 호출한 경우");
        int sum = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총합 : "+ sum);
        System.out.println("\n");

        System.out.println("forEach(최종 처리 메서드)를 마지막에 호출한 경우");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n)); //최종 메서드로 동작함
    }
}
