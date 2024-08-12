package org.main.basic.generic;

import java.util.ArrayList;
import java.util.List;

public class ContradictionExam {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        add(ints);
    }

    private static void add(List<?> ints){
//        ints.add(34); // 외부에서 받은 List<Integer>에 Double을 추가하는 모순 발생
    }
}
