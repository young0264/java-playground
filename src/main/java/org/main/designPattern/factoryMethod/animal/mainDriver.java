package org.main.designPattern.factoryMethod.animal;

public class mainDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalToy dogToy = dog.getToy();
        AnimalToy catToy = cat.getToy();

        dogToy.identify();
        catToy.identify();

    }
}
