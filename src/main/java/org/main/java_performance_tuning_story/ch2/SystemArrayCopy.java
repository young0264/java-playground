package org.main.java_performance_tuning_story.ch2;

public class SystemArrayCopy {
    public static void main(String[] args) {
        String[] arr = new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"};
        String[] copiedArr = new String[3];

        /** 복사할배열, 복사 시작 인덱스, 저장될 배열, 저장시작 인덱스, 복사 요소 개수 */
        System.arraycopy(arr, 2, copiedArr, 1, 2);

        /** null, CCC , DDD 출력 */
        for(String value: copiedArr ){
            System.out.println(value);
        }
    }
}
