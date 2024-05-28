package org.main.basic.knouExamGrammar;

abstract class AnimalByAbstract {
    abstract void sound();
}

interface AnimalByInterface {
    void sound();
}

/**
 * 익명 클래스 : 이름없는 클래스 (추상/인터페이스의 메서드를 즉시 구현해야 할 때 유용)
 * */
public class AnonymousClassExam {
    public static void main(String[] args) {

        /** 추상클래스를 사용한 익명클래스 */
        AnimalByAbstract animalByAbstract = new AnimalByAbstract() {
            @Override
            void sound() {
                System.out.println("some abs sound");
            }
        };
        animalByAbstract.sound(); // 익명 클래스에서 구현한 메서드 호출

        /** 인터페이스를 사용한 익명클래스 */
        AnimalByInterface animalByInterface = new AnimalByInterface() {
            @Override
            public void sound() {
                System.out.println("some inter sound");
            }
        };
        animalByInterface.sound(); // 익명 클래스에서 구현한 메서드 호출

    }
}
