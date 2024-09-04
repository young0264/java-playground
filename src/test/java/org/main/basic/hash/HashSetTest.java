package org.main.basic.hash;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    void addAndPrintHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        // 3,1,5,4,2 순으로 Add
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(2);

        System.out.println("============");
        for (int item : hashSet) {
            System.out.print(item);
        }
        System.out.println("\n============");

    }
}
