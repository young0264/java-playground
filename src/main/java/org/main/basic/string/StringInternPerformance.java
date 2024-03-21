package org.main.basic.string;

public class StringInternPerformance {

    public static void main(String[] args) {
        String a = "apple";
        String b = new String("appleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleapple");
        String c = new String("appleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleappleapple");

//        String c = "apple";
//        String d = new String("apple");
//        String e = a.intern();
//

        long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기
        /** 1000개의 객체간 equals 문자열 비교 */
        for (int i = 0; i < 10000000; i++) {
            boolean equals = c.equals(b);
        }
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long diffTime = afterTime - beforeTime; // 두 개의 실행 시간
        System.out.println("실행 시간1(ms): " + diffTime); // 세컨드(초 단위 변환)


        long beforeTime2 = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기
        /** 1000개의 객체간 ==을 사용해 intern으로 문자열 비교  */
        for (int i = 0; i < 1000000; i++) {
            boolean res = (a == b.intern());
        }
        long afterTime2 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long diffTime2 = afterTime2 - beforeTime2; // 두 개의 실행 시간
        System.out.println("실행 시간2(ms): " + diffTime2); // 세컨드(초 단위 변환)
    }

    public static boolean isEqualAddress (String a, String b){
        return a.equals(b);
    }

    public static boolean isEqualByIntern(String a, String bObject) {
        return a.equals(bObject);
    }

    public static boolean isEqualValue(String a, String b) {
        return a == b;
    }
    public static boolean isEqualValueByIntern(String a, String bObject) {
        return a == bObject;
    }


}
