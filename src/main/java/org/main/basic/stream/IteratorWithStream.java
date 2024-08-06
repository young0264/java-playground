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

        /** 후 : stream 사용 */
        List<String> listForStream = Arrays.asList("한식", "중식", "양식");
        Stream<String> stream = listForStream.stream();
        stream.forEach(name -> System.out.println("name : " + name));
    }
}
