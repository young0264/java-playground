package org.main.basic.knouExamGrammar.threadExam;

public class Counter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public int getValue() {
        return c;
    }
}
