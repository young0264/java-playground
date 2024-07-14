package org.main.basic._class;

public class overloadingExam {

    /** 두개의 매개변수가 int 타입인 오버로딩 메서드 */
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    /** 두개의 매개변수가 double 타입인 오버로딩 메서드 */
    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    /** 매개변수 이름만 다름 : overloading이 아님 */
//    double plus(double x2, double y2) {
//        double result = x2 + y2;
//        return result;
//    }

    /** 리턴 타입만 다름 : overloading이 아님 */
//    String plus(double x, double y) {
//        double result = x + y;
//        return "test";
//    }

    public void t1() {
        plus(10, 20.3); // int -> double 로 자동 형변환 되어 double 타입의 plus 메서드 선택
    }

}

