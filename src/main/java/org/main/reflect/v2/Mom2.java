package org.main.reflect.v2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Mom2 {
    private String name;
    private int age;
    private String address;


    public Mom2() {
    }

    public Mom2(String name, int age, String address) {
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
        Son2 son2 = new Son2("name", 1, "address");
//        son.playingGame(); //private 접근 불가
        son2.fact();
        son2.study();

        // reflection 시작
        Class<?> sonClass = Class.forName("org.main.reflect.v2.Son2");
        Constructor<?> constructor = sonClass.getConstructor(String.class, int.class, String.class);
        Object sonObject = constructor.newInstance("name", 1, "address");

        Method playingGame = Son2.class.getDeclaredMethod("playingGame");
        playingGame.setAccessible(true);
        playingGame.invoke(sonObject); //메서드 실행

    }



}
