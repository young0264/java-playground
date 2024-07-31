package org.main.basic.functionalInterface;

public class MyFunctinalInterfaceExam1 {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };

        fi.method1();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method1();

        fi = () -> System.out.println("method call3"); // 실행문이 하나면 중괄호 생략 가능.
        fi.method1();
    }
}
