package org.main.reflect.v1;

import org.main.reflect.v2.Son2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Mom {
    private String name;
    private int age;
    private String address;


    public Mom() {
    }

    public Mom(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void cooking() {
//        Son son = new Son();
        System.out.println("Mom is cooking.");
    }


    /***/
    public static void main(String[] args) throws Exception {
        Son son = new Son("name", 1, "address");
        Son2 son2 = new Son2("name", 1, "address");

        /** private 접근제한자는 클래스 내에서만 */
//        son.playingGame();
        son.fact();
        son.study();

        /** 하지만 reflection(package java.lang.reflect;) 으로 접근 가능*/

        /** son1 접근*/
        Class<?> sonClass = Class.forName("org.main.reflect.v1.Son");
        Constructor<?> constructor = sonClass.getConstructor(String.class, int.class, String.class);
        Object sonObject = constructor.newInstance("name", 1, "address");

        /** son2 접근*/
        Class<?> sonClass2 = Class.forName("org.main.reflect.v2.Son2");
        Constructor<?> constructor2 = sonClass2.getConstructor(String.class, int.class, String.class);
        Object sonObject2 = constructor2.newInstance("name", 1, "address");

        Method playingGame = Son.class.getDeclaredMethod("playingGame");
        Method playingGame2 = Son2.class.getDeclaredMethod("playingGame");
        playingGame.setAccessible(true);
        playingGame2.setAccessible(true);
        playingGame.invoke(sonObject); //메서드 실행
        playingGame2.invoke(sonObject2); //메서드 실행
    }
}
