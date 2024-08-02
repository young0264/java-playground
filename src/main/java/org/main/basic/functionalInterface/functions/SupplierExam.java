package org.main.basic.functionalInterface.functions;

import lombok.extern.slf4j.Slf4j;

import java.util.function.*;

/**
 * 인터페이스 명 : Supplier<T>
 * 추상메서드 명 : T get()
 * API 설명 : 매개 변수를 사용하지 않고 return 하는 함수 형태
 **/
@Slf4j
public class SupplierExam {
    public static void main(String[] args) {

        /** T 객체를 return */
        Supplier<Object> supplier = () -> new Object();
        System.out.println(supplier.get());

        /** boolean 값을 return */
        BooleanSupplier booleanSup =  () -> true;
        System.out.println(booleanSup.getAsBoolean());

        /** int 값을 return */
        IntSupplier intSup = () -> {
            int num = 7;
            return num;
        };
        System.out.println("intSup : " + intSup.getAsInt());

        /** double 값을 return */
        DoubleSupplier doubleSup = () -> 1.0;
        System.out.println("doubleSup : " + doubleSup.getAsDouble());

        /** long 값을 return */
        LongSupplier longSup = () -> 1L;
        System.out.println(longSup.getAsLong());
    }

}
