package org.main.invokedynamic;

import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateTest {

    public static void main(String[] args) {
        final int NUM_THREE = 3;

        Predicate<List<String>> greaterListSize = nameList -> nameList.size() > NUM_THREE;

        List<String> firstTestList = List.of("a", "b", "c");
        List<String> secondTestList = List.of("a", "b", "c","d","e");

        boolean firstRes = greaterListSize.test(firstTestList);
        boolean secondRes = greaterListSize.test(secondTestList);

        System.out.println("first result : " + firstRes);
        System.out.println("second result : " + secondRes);

    }
}
