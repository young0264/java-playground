package org.main.async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
@Transactional
public class AsyncTest {

    @Test
    @DisplayName("synchronized 스레드간 데드락 상황 연출")
    public void deadLockSimulationTest() {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread thread1 get lock1");
                synchronized (lock2) {
                    System.out.println("Thread thread1 get lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread thread2 get lock2");
                synchronized (lock1) {
                    System.out.println("Thread thread2 get lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
