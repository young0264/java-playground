package org.main.basic.functionalInterface;

public class RunnableExample {
    public static void main(String[] args) {

        /** 방법1 */
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("=====================");

        /** 방법2 */
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread2.start();

    }
}
