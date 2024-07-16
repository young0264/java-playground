package org.main.basic.thread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreadCooperation {

    @Test
    @DisplayName("두 스레드를 생성하고 실행하는 메서드")
    void WaitNotifyExam() {
        WorkObject workObject = new WorkObject();

        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }

    /** 두 스레드의 작업 내용을 동기화 메서드로 작성한 공유 객체 */
    public class WorkObject {
        public synchronized void methodA() {
            System.out.println("ThreadA의 methodA() 실행");
            notify(); //일시 정지인 스레드B를 실행상태로 만듦
//            notifyAll(); //일시 정지인 스레드B를 실행상태로 만듦
            try {
                wait(); //현재 스레드 A를 정지
            } catch (InterruptedException e) {

            }
        }

        public synchronized void methodB() {
            System.out.println("ThreadB의 methodB() 실행");
            notify(); //일시 정지인 스레드A를 실행상태로 만듦
            try {
                wait(); //현재 스레드 B를 정지
            } catch (InterruptedException e) {

            }
        }
    }

    public class ThreadA extends Thread {
        private WorkObject workObject;

        public ThreadA(WorkObject workObject) {
            this.workObject = workObject;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                workObject.methodA();
            }
        }
    }

    public class ThreadB extends Thread {
        private WorkObject workObject;

        public ThreadB(WorkObject workObject) {
            this.workObject = workObject;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                workObject.methodB();
            }
        }
    }




}
