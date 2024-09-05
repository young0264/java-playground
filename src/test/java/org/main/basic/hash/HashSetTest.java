package org.main.basic.hash;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    void addAndPrintHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        // 3,1,5,4,2 순으로 Add
//        hashSet.add(3);
//        hashSet.add(1);
//        hashSet.add(5);
//        hashSet.add(4);
//        hashSet.add(2);
//        hashSet.add(6);
        hashSet.add(1111);
        hashSet.add(2222);
        hashSet.add(3333);
        hashSet.add(35263254);
        hashSet.add(15263254);

        System.out.println("============");
        System.out.println(String.format("hashSet : %s", hashSet));
        for (int item: hashSet) {
            System.out.println("itme : "+ item);
        }
        System.out.println("\n============");

    }
}
