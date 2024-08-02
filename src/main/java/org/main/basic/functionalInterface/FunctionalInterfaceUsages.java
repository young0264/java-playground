package org.main.basic.functionalInterface;

public class FunctionalInterfaceUsages {
    public static void main(String[] args) {
//        Consumer;
//        Supplier;
//        Function;
//        Predicate;
//        Runnable;
//        UnaryOperator;
//        BinaryOperator;
//        Thread;

        Runnable task = () -> System.out.println("Running a task");

        System.out.println("before");
        task.run();
        System.out.println("after");
    }
}
