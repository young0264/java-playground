package org.main.java_performance_tuning_story.using_synchronized;

public class InfinitThread extends Thread {
    int value = Integer.MIN_VALUE;
    private boolean flag = true;

    public void run() {
        while (flag) {
            value++;
            System.out.println("value : " + value);
            if (value == Integer.MAX_VALUE) {
                value = Integer.MIN_VALUE;
                System.out.println("MAX_VALUE 도달 ~!");
            }
            try {
                Thread.sleep(0, 1);
            } catch (Exception e) {
                break;
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
