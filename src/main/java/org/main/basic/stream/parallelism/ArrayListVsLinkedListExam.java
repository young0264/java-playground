package org.main.basic.stream.parallelism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExam {

    /** 요소 처리 */
    public static void work(int value) {
    }

    /** 병렬 처리 */
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach((a) -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static void main(String... args) {
        //소스 컬렉션
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
//        for (int i = 0; i < 100; i++) { // 요소의 갯수가 적을시 LinkedList가 더 빠름, 각 요소가 참조값을 가진 node로 존재하기 때문
        for (int i = 0; i < 1000000; i++) { // ArrayList가 더 빠름,
            arrayList.add(i);
            linkedList.add(i);
        }

        //워밍업 -> 캐싱 영향으로 ArrayList가 빠른 경우가 많아짐(배열배치, 캐시 효율성증가)
//        long arrayListListParallel = testParallel(arrayList);
//        long linkedListParallel = testParallel(linkedList);

        //병렬 스트림 처리 시간 구하기
        long arrayListListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        System.out.println("arrayListListParallel : "+ arrayListListParallel);
        System.out.println("linkedListParallel : "+ linkedListParallel);

        if (arrayListListParallel < linkedListParallel) {
            System.out.println("성능 테스트 결과: ArrayList 처리가 더빠름");
        } else {
            System.out.println("성능 테스트 결과: LinkedList 처리가 더빠름");
        }
    }
}
