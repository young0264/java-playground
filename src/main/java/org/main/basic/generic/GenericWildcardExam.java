package org.main.basic.generic;

import java.util.Arrays;
import java.util.Collection;

public class GenericWildcardExam {
    public static void main(String[] args) {
        MyArrayList<Number> list;

        // MyArrayList 생성하기
        Collection<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        list = new MyArrayList<>(col);

        // MyArrayList 출력
        System.out.println(Arrays.stream(list.itemList).toList()); // [1, 2, 3, 4, 5]
    }


    static class MyArrayList<T> {
        Object[] itemList = new Object[5];
        int index = 0;

        public MyArrayList(Collection<? extends T> items) {
            for (T item : items) {
                itemList[index++] = item;
            }
        }
    }

}
