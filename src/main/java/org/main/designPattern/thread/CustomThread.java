package org.main.designPattern.thread;

public class CustomThread implements Runnable {

//    public CustomThread() {
//    }

    @Override
    public void run() {
        System.out.println("Thread is running, thread name : "+ Thread.currentThread().getName());
    }

}
