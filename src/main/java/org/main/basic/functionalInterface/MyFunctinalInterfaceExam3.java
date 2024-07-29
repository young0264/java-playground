package org.main.basic.functionalInterface;

public class MyFunctinalInterfaceExam3 {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithReturn fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };

//        System.out.println(fi.method(2,5));
    }
}
