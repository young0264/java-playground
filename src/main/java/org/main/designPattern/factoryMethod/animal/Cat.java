package org.main.designPattern.factoryMethod.animal;

public class Cat extends Animal {

    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
