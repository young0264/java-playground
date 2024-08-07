package org.main.basic.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {
    public static void main(String[] args) {

        /** 숫자 요소일 때 */
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream
                .sorted()
                .forEach(n -> System.out.print(n + ", "));

        /** 객체일 때 */
        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식 식당", 100),
                new Kitchen("중식 식당", 50),
                new Kitchen("양식 식당", 80)
        );

        System.out.println("\n");

        kitchenList
                .stream()
                .sorted()
                .forEach(k -> System.out.print(k.getCapacity() + ", "));

        System.out.println("\n");

        kitchenList
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(k -> System.out.print(k.getCapacity() + ", "));


    }
}
