package org.main.designPattern.FactoryMethod;

public class CreamPasta extends Pasta {

    @Override
    public void prepare() {
        System.out.println("크림 파스타를 준비중에 있습니다.");
    }

    @Override
    public void cook() {
        System.out.println("크림 파스타를 요리중 입니다.");
    }

    @Override
    public void pack() {
        System.out.println("크림 파스타를 포장중 입니다.");
    }
}
