package org.main.basic.generic;

import java.util.ArrayList;
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

        public MyArrayList(Collection<? extends T> items) { //범위 제한.
            for (T item : items) {
                itemList[index++] = item;
            }
        }

        /** 타입 추론이 불가능한 논리적 에러 */
//        public MyArrayListWithUnboundedWildcard(Collection<?> items) { //범위 제한.
//            for (T item : items) {
//                itemList[index++] = item;
//            }
//        }
    }

    public void test1() {
        ArrayList<? extends Object> parent = new ArrayList<>();
        ArrayList<? extends Number> firstChild = new ArrayList<>();
        ArrayList<? extends Integer> secondChild = new ArrayList<>();

        parent = firstChild; // 제네릭 공변성(업캐스팅)
        firstChild = (ArrayList<? extends Number>) parent; // 반공변성 (제네릭 다운캐스팅)

        parent= firstChild;
    }

    public void test2() {
        Object firstNum = 1; //auto-boxing
        Number secondNum = 2; //auto-boxing
        Integer thirdNum = 3; //auto-boxing

        firstNum = secondNum;
        secondNum = (Number) firstNum; // 다운캐스팅( 상위->하위 명시적)
        firstNum = secondNum; // 업캐스팅(하위->상위 자동처리, 하위가 상위의 속성을 갖고있기 때문에 안전)

        secondNum = thirdNum;
        thirdNum = (Integer) secondNum; // 다운캐스팅


    }

}
