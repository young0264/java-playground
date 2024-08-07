package org.main.basic.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorWithStream {
    public static void main(String[] args) {

        /** 전 : iterator 사용*/
        List<String> listForIter = Arrays.asList("한식", "중식", "양식");
        Iterator<String> iterator = listForIter.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next : " + next);
        }

        System.out.println("===========");

        /** 후 : stream 사용 */
        List<String> listForStream = Arrays.asList("한식", "중식", "양식");
        Stream<String> stream = listForStream.stream();
        stream.forEach(name -> System.out.println("name : " + name));

        System.out.println("===========");

        /** stream으로 객체를 가져와 람다식의 매개값으로 제공 */
        List<Kitchen> listForMiddleProcessWithLambda = Arrays.asList(
                new Kitchen("한식", 100),
                new Kitchen("중식", 50),
                new Kitchen("양식", 80)
                );

        listForMiddleProcessWithLambda.stream()
                .forEach(kitchen -> {
                    int capacity = kitchen.getCapacity();
                    String type = kitchen.getType();
                    System.out.println("type : " + type);
                    System.out.println("capacity : " + capacity);
                }
                );
    }
}
