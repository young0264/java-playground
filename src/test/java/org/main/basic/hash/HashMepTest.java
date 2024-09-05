package org.main.basic.hash;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class HashMepTest {

    @Test
    void addAndPrintHashMap() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        // 3,1,5,4,2 순으로 Add
        hashMap.put(3, 10);
        hashMap.put(1, 10);
        hashMap.put(5, 10);
        hashMap.put(4, 10);
        hashMap.put(2, 10);

        System.out.println("============");
        System.out.println(hashMap);
        System.out.println("\n============");

    }
}
