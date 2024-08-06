package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExam {

    public static void main(String[] args) {

        List<Kitchen> kitchenList = Arrays.asList(
                new Kitchen("한식", 100),
                new Kitchen("중식", 50),
                new Kitchen("양식", 80)
        );

        double asDouble = kitchenList.stream()
                .mapToInt(Kitchen::getCapacity) // 중간처리(수용 인원으로 매핑)
                .average() // 최종처리(평균 점수 처리)
                .getAsDouble();
        System.out.println("평균 점수 : "+ asDouble);
    }

}
