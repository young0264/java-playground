package org.main.basic.string;

public class StringIntern {

    public static void main(String[] args) {

        String a = "apple";
        String b = new String("apple");
        String c = "apple";
        String d = new String("apple");
        String e = a.intern();

        if (isEqualAddress(a, c) && isEqualValue(a,c) ) {
            System.out.println("String pool에 있는 문자열 비교는 같습니다.");
        }
        if (!isEqualValue(b, d) && isEqualAddress(b, d)) {
            System.out.println("String 객체의 비교는 값비교만 같고 주소비교는 서로 다릅니다 ");
        }
        if (isEqualValueByIntern(a, e)) {
            System.out.println("String pool의 문자와 같은 string value 가진 intern 객체의 주소 비교는 같습니다");
        }
        if (isEqualByIntern(a, e)) {
            System.out.println("String pool의 문자와 같은 string value의 inter 값 비교는 같습니다.");
        }
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
