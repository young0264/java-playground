package org.main.java_performance_tuning_story.using_synchronized;

public class Sleep extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("미안하지만 interrupt로 스레드 종료함");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Sleep s = new Sleep();
        s.start();
        try {
            int cnt = 0;
            while (cnt < 5) {
                s.join(1000); //1초씩 기다림
                cnt++;
                System.out.format("%d 초 기다림\n", cnt);
            }
            if (s.isAlive()) { //스레드가 살아 있으면
                s.interrupt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
