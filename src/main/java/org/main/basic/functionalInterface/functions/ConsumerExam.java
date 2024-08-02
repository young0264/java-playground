package org.main.basic.functionalInterface.functions;

import java.util.function.*;

public class ConsumerExam {

    public static void main(String[] args) {

        /** String param 1 */
        Consumer<String> consumer1 =
                item -> {
                    System.out.println();
                };
        consumer1.accept("one param using consumer");

        /** String, Integer param 2 */
        BiConsumer<String, Integer> consumer2 =
                (a, b) -> {
                    System.out.println("입력값1 : " + a + ", 입력값2 : " + b);
                };
        consumer2.accept("tow param using consumer",2);


        /** int param 1 */
        IntConsumer consumer3 = a -> {
            System.out.println("입력값 : " + a);
        };
        consumer3.accept(3);

        /** double param 1 */
        DoubleConsumer consumer4 = a -> {
            System.out.println("입력값 : " + a);
        };
        consumer4.accept(11.1);

        /** long param 1 */
        LongConsumer consumer5 = a -> {
            System.out.println("입력값 : " + a);
        };
        consumer5.accept(10000000000L);

    }


}
