package org.main.designPattern.strategy;

public class TempleKitchen implements Kitchen{

    @Override
    public void cook() {
        System.out.println("사찰음식 : 뭣허냐. 퍼떡퍼떡 안가져오고");
    }
}
