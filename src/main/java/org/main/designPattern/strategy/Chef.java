package org.main.designPattern.strategy;

public class Chef {

    void cook(Kitchen kitchen) {
        System.out.println("\n전쟁이 시작되었습니다.");
        kitchen.cook();
        System.out.println("오늘 하루 서비스가 끝났습니다\n");
    }
}
