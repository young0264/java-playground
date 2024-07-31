package org.main.basic.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VarianceWithGeneric {
    public static void print(List<Integer> arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
//    public static void print(List arr) {
//        for (Integer obj : arr) {
//            System.out.println(obj);
//        }
//    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        print(integers); // ! 제네릭에 선언하는 type은 캐스팅이 안됨.
    }
}
