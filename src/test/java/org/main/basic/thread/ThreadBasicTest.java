package org.main.basic.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

@Slf4j
public class ThreadBasicTest {

    @Test
    @DisplayName("main과 worker 같이 실행")
    void runWithMainAndWorker() {
        BeepTask beepTask = new BeepTask();
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

    /** 0.5초마다 beep하는 inner class */
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


}
