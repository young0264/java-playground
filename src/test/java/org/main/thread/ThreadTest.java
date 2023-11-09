package org.main.thread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.designPattern.thread.CustomThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTest {




    @Test
    @DisplayName("ExecutorService, ThreadPoolExecutor를 사용한 Thread Pool 생성 ")
    void t1() {
//        ExecutorService executorService = new ExecutorService();
        ExecutorService executor = Executors.newFixedThreadPool(10); // 크기가 10인 스레드 풀 생성
        executor.execute(() -> System.out.println("Hello World1"));
        executor.execute(() -> System.out.println("Hello World2"));
        executor.execute(() -> System.out.println("Hello World3"));
        executor.shutdown(); // 스레드 풀 종료

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
    }

    @Test
    @DisplayName("순서가 제어되지 않는 Thread")
    void t2() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new CustomThread());
            thread.start();
        }
    }
}