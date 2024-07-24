package org.main.basic.thread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreadCooperation2 {


    @Test
    @DisplayName("두 스레드를 생성 후 실행하는 메인 스레드")
    void WaitNotifyExam() {
        DataBox dataBox = new DataBox();
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);
        producerThread.start();
        consumerThread.start();
    }

    /** 두 스레드 작업내용을 동기화 메서드로 작성한 공유 객체 */
    class DataBox {
        private String data;

        public synchronized String getData() {
            if (data == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            String temp = data;

            System.out.println("ConsumerThread가 읽은 데이터 : " + temp);

            data = null;
            notify();
            return temp;
        }

        public synchronized void setData(String data) {
            if (this.data != null) {
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
            this.data = data;
            System.out.println("ProducerThread가 생성한 data : " + data);
            notify();
        }
    }

    /** 데이터 생성(저장) */
    class ProducerThread extends Thread{
        private DataBox databox;

        public ProducerThread(DataBox databox) {
            this.databox = databox;
        }

        @Override
        public void run() {
            for(int i=1; i<=3; i++){
                String data = "data : " + i; //String data에 로그성 데이터 입력
                databox.setData(data);
            }
        }
    }

    /** 데이터 소비(읽기) */
    class ConsumerThread extends Thread{
        private DataBox databox;

        public ConsumerThread(DataBox databox) {
            this.databox = databox;
        }

        @Override
        public void run() {
            for(int i=1; i<=3; i++){
                String data = databox.getData();
            }
        }
    }

}
