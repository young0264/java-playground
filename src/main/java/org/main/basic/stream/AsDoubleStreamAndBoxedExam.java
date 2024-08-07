package org.main.basic.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExam {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArr);

        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println("d : " + d));

        System.out.println("====================");

        IntStream intStream2 = Arrays.stream(intArr); // stream은 한번 사용시 소모
        intStream2
                .boxed()
                .forEach(obj -> System.out.println("obj : " +obj.intValue()));
    }
}
