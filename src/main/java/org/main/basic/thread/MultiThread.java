package org.main.basic.thread;

/** Thread 클래스를 상속받는 방법 */
class ThreadWithClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " : " + i ); //스레드 이름
            try {
                Thread.sleep(10);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

/** Runnable 인터페이스를 구현하는 방법 */
class ThreadWithRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MultiThread {
    public static void main(String[] args) {
//        ThreadWithClass threadWithClass = new ThreadWithClass();
        new Thread(new ThreadWithRunnable()).start();
        new Thread(new ThreadWithRunnable()).start();
        new Thread(new ThreadWithRunnable()).start();


    }
}

