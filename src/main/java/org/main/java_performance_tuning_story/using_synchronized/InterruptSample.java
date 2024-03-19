package org.main.java_performance_tuning_story.using_synchronized;

public class InterruptSample {
    public static void main(String[] args) throws InterruptedException {
        InfinitThread infinitThread = new InfinitThread();
        infinitThread.start();
        Thread.sleep(2000);
        System.out.println("isInterrupted 시작 = " + infinitThread.isInterrupted());
        infinitThread.interrupt(); // interrupt는 특정 상황에서 동작.
        System.out.println("isInterrupted 끝 = " + infinitThread.isInterrupted());
        infinitThread.setFlag(false);
    }
}
