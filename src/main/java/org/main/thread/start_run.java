package org.main.thread;

/**
 * https://kim-jong-hyun.tistory.com/101
 * https://steady-coding.tistory.com/548
 * thread.start() vs thread.run() 차이 분석
 * run() : 새로운 call stack을 생성하지 않고 현재 call stack에 새로운 thread가 실행 (싱글스레드)
 * start() : 새로운 call stack을 생성하고, 새로운 thread가 그 위에서 실행 (멀티스레드)
 * */
public class start_run {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        System.out.println("thread start : " + Thread.currentThread().getName());

//        ReflectionFactory
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println("thread run start : " + Thread.currentThread().getName()));
//            threads[i].start();
            threads[i].run();
        }
    }
}
