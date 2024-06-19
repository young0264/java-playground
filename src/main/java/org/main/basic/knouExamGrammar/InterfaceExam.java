package org.main.basic.knouExamGrammar;

public interface InterfaceExam {

    public void notReturnExamMethod();

    default void defaultMethodExamInInterface() {
        System.out.println("have to implement method");
    }

    static void staticMethodExamInInterface() {
        System.out.println("have to static method");
    }

}
