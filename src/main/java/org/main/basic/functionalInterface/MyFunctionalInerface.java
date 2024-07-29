package org.main.basic.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInerface {
    public void method1();
//    public void method2(); //컴파일 에러

//    MyFunctionalInerface fi = () -> {
//        fi.method1();
//    };
}
