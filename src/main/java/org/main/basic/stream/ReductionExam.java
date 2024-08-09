package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExam {
    public static void main(String[] args) {

        /** 객체일 때 */
        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식", 100),
                new Kitchen("중식", 50),
                new Kitchen("양식", 80)
        );
        // 방법 1
        int sum1 = kitchenList.stream()
                .mapToInt(Kitchen::getCapacity)
                .sum();
        System.out.println("sum1: " + sum1);

        // 방법 2
        int sum2 = kitchenList.stream()
                .map(Kitchen::getCapacity)
                .reduce((a, b) -> a + b).get();
        System.out.println("sum2: " + sum2);

        // 방법 3
        int sum3 = kitchenList.stream()
                .map(Kitchen::getCapacity)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum3: " + sum3);
    }
}
