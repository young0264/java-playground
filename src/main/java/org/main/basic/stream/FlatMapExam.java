package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExam {
    public static void main(String[] args) {
        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식 식당", 100),
                new Kitchen("중식 식당", 50),
                new Kitchen("양식 식당", 80)
        );

        kitchenList.stream()
                .flatMap(item -> Arrays.stream(item.getType().split(" ")))
                .forEach(item -> System.out.println(item));

        System.out.println("====================");

        List<String> stringList = Arrays.asList("10, 20, 30", "40, 50, 60");
        stringList
                .stream()
                .flatMapToInt(item -> {
                    String[] strArr = item.split(",");
                    /***/
                    System.out.println("strArr : " + Arrays.toString(strArr));
                    for (int i = 0; i < strArr.length; i++) {
                        System.out.println(strArr[i]);
                    }
                    /***/

                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println("number: " + number));
    }
}
