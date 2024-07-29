package org.main.basic.functionalInterface;

public class MyFunctinalInterfaceExam2 {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithInt fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x*5);
        };
        fi.method(2);
    }
}
