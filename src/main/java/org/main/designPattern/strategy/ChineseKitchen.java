package org.main.designPattern.strategy;

public class ChineseKitchen implements Kitchen{

    @Override
    public void cook() {
        System.out.println("중식 : 와따셩마밍쯔 빨리빨리 하라");
    }
}
