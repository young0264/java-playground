package org.main.basic.functionalInterface;

public class UsingLocalVariable {

    void method(int arg) { // arg는 final 특성을 가짐
        int localVar = 40; // localVar은 final 특성을 가짐

//        arg = 31; // final 특성 때문에 수정 불가
//        localVar = 41; // final 특성 때문에 수정 불가

        // 람다식
        MyFunctinalInterfaceExam4 fi = () -> {

            //로컬 변수 읽기
            System.out.println("arg : " + arg);
            System.out.println("localVar : "+ localVar + "\n");
        };

        fi.method();

    }


}
