package org.main.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("한식", "중식", "양식", "한병렬", "중병렬");

        /** 순차 처리 (main 스레드에서만 처리) */
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExam::print); //메서드 참조

        System.out.println("==================");

        /**
         * 병렬 처리
         * ForkJoinPool 사용을 볼 수 있음
         **/
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExam::print);
    }

    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

}
