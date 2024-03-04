package org.main.designPattern.strategy;

/** 단일상속이라는 제한이 있는 템플릿 메서드 패턴보다는
 * 인터페이스를 사용한 전략패턴이 더욱 많이 활용됨
 * */

/**
 * 전략패턴 : 클라이언트가 전략을 생성해 전략을 실행할 컨텍스트에 주입하는 패턴
 *  -> 즉, 런타임에 클라이언트가 전략을 선택하여 객체동작을 실시간으로 바꿀 수 있음
 *  --------------------------------------------------------
 *  Collections의 sort() 메서드에 의해 구현되는 compare() 메서드에 이용
 * javax.servlet.http.HttpServlet에서 service() 메서드와 모든 doXXX() 메서드에 이용
 * javax.servlet.Filter의 doFilter() 메서드에 이용
 * inpa : https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%EC%A0%84%EB%9E%B5Strategy-%ED%8C%A8%ED%84%B4-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EB%B0%B0%EC%9B%8C%EB%B3%B4%EC%9E%90#strategy_pattern
 * */
public class MainPass {

    public static void main(String[] args) {

        Kitchen kitchen = null;
        Chef chef = new Chef();

        kitchen = new ChineseKitchen();
        chef.cook(kitchen);

        kitchen = new DiningKitchen();
        chef.cook(kitchen);

        kitchen = new TempleKitchen();
        chef.cook(kitchen);
    }
}
