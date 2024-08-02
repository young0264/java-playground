package org.main.basic.functionalInterface.functions;

import java.util.function.Predicate;

public class PredicateExam {
    public static void main(String[] args) {

        final int MIN_NUM = 10;
        final int MAX_NUM = 20;
        final int THRESHOLD_5 = 5;
        final int THRESHOLD_15 = 15;
        final int THRESHOLD_50 = 50;

        Predicate<Integer> greater = x -> x > MIN_NUM;
        Predicate<Integer> less = x -> x < MAX_NUM;

        // x > MIN_NUM && x < MAX_NUM
        Predicate<Integer> between = greater.and(less);
        System.out.println("between : " + between.test(THRESHOLD_15)); // true

        // x > MIN_NUM || x < MAX_NUM
        Predicate<Integer> all = greater.or(less);
        System.out.println("all : " + all.test(THRESHOLD_5)); // true

        // x <= MIN_NUM
        Predicate<Integer> negate = greater.negate();
        System.out.println("negate : " + negate.test(THRESHOLD_50)); // false
    }
}
