package org.main.designPattern.factoryMethod.animal;

public class Dog extends Animal {

    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
