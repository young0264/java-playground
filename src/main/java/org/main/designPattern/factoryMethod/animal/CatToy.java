package org.main.designPattern.factoryMethod.animal;

public class CatToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("고양이 장난감입니다~!");
    }
}
