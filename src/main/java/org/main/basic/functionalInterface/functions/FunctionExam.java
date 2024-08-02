package org.main.basic.functionalInterface.functions;

import java.util.function.*;

/**
 * 인터페이스 명 : Function<T, R>
 * 추상메서드 명 : R apply(T t)
 * API 설명 : 매개값을 받아와서 특정 타입으로 return
 **/
public class FunctionExam {
    public static void main(String[] args) {

        Function<Integer, String> intToStr = item -> String.valueOf(item);
        String strVal = intToStr.apply(100);
        System.out.println("strVal: "+ strVal);

        ToIntFunction<String> strToInt = item -> Integer.parseInt(item);
        int numVal = strToInt.applyAsInt("100");
        System.out.println("numVal: "+ numVal);

        IntToDoubleFunction intToDouble = item -> (double) item;
        double doubleVal = intToDouble.applyAsDouble(100);
        System.out.println("doubleVal: "+ doubleVal);
    }
}
