package org.main.basic.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1. 모든 요소가 2의 배수인지
 * 2. 하나라도 3의 배수가 존재하는지
 * 3. 모든 요소가 3의 배수가 아닌지
 **/
public class MatchExam {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result = Arrays.stream(intArr)
                .allMatch(x -> x % 2 == 0);
        System.out.println("모든 요소가 2의 배수인지? : " + result);

        result = Arrays.stream(intArr)
                .anyMatch(x -> x % 3 == 0);
        System.out.println("하나라도 3의 배수가 존재하는지? : " + result);

        result = Arrays.stream(intArr)
                .noneMatch(x -> x % 3 == 0);
        System.out.println("3의 배수가 없는게 맞는지? : " + result);
    }

}
