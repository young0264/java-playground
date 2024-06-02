package org.main.basic.knouExamGrammar.threadExam;

public class CounterTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        /** 서로 다른 두개의 Thread 실행 */
        MyThread t1 = new MyThread(counter);
        t1.start();

        MyThread t2 = new MyThread(counter);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("counter.getValue : " + counter.getValue());

    }
}
