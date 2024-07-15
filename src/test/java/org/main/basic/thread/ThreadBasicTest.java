package org.main.basic.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

@Slf4j
public class ThreadBasicTest {

    @Test
    @DisplayName("[Runnable 사용]main과 worker 같이 실행")
    void runWithMainAndWorker() {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("e : "+ e.getMessage());
            }
        }
    }

    /** [Runnable 상속] 0.5초마다 실행하는 inner class */
    public class BeepTask implements Runnable {
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
//                toolkit.beep();
                System.out.println("땅땅");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("e : "+ e.getMessage());
                }
            }
        }
    }


    @Test
    @DisplayName("[Thread 하위 클래스]")
    void runWithMainAndWorkerUnderThreadClass() {
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    /**
     * [Thread 사용]
     */
    public class BeepThread extends Thread {
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
//                toolkit.beep();
                System.out.println("띠잉");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        }
    }

    @Test
    @DisplayName("우선 순위를 통한 스레드 실행")
    void runThreadUsingPriority() {
        for (int i = 0; i <= 10; i++) {
            Thread thread = new CalcThread("thread" + i);
            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }

    public class CalcThread extends Thread {

        public CalcThread(String name) {
            setName(name);
        }

        public void run() {
            for (int i = 0; i < 2000000000; i++) {
            }
            System.out.println(getName());
        }
    }



}
