package org.main.designPattern.factoryMethod.animal;

/** 오버라이드된 메서드가 객체를 반환하는 패턴*/
public class mainDriver {


    /**
     * Dog 클래스내에서 Animal의 메서드를 override한 메서드는
     * Toy에 관한 AnimalToy(DogToy) 객체를 반환함. -> "팩터리 메서드가 반환하는 객체"
     * DogToy 클래스내에서 AnimalToy의 메서드를 override한 메서드를 실행함
     * */
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalToy dogToy = dog.getToy();
        AnimalToy catToy = cat.getToy();

        dogToy.identify();
        catToy.identify();

    }
}
