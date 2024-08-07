package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExam {
    public static void main(String[] args) {

        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식", 100),
                new Kitchen("중식", 50),
                new Kitchen("양식", 80)
        );

        double capaAvg = kitchenList.stream()
//                .filter( item -> !item.getType().equals("중식") && !item.getType().equals("양식")) //filter 조건 두개
                .filter(item -> !item.getType().equals("중식"))
                .mapToInt(Kitchen::getCapacity)
                .average()
                .getAsDouble();

        System.out.println("중식을 제외한 평균 capacity : " + capaAvg);

    }
}
