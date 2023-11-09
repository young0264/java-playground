package org.main.designPattern.strategy;

public class DiningKitchen implements Kitchen{

    @Override
    public void cook() {
        System.out.println("다이닝 : 침착하게! 정확하게! 빨리!");
    }
}
