package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;

public class MapExam {
    public static void main(String[] args) {
        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식 식당", 100),
                new Kitchen("중식 식당", 50),
                new Kitchen("양식 식당", 80)
        );

        kitchenList
                .stream()
                .mapToInt(Kitchen::getCapacity)
                .forEach(capa -> System.out.println("capacity : "+ capa));
    }
}
