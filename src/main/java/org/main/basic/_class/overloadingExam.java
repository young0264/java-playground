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


    public void t1() {
        plus(10, 20.3); // int -> double 로 자동 형변환 되어 double 타입의 plus 메서드 선택
    }

}

