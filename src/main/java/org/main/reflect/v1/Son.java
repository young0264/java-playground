package org.main.reflect.v1;

public class Son {

    private String name;
    private int age;
    private String address;

    public Son(String name, int i, String address) {
        this.name = name;
        this.age = i;
        this.address = address;
    }

    public Son() {
    }

    void study() {
        System.out.println("아들은 공부중");
    }

    public void fact() {
        System.out.println("아들이 몰래 게임하는거 몰라");
    }

    private void playingGame() {
        System.out.println("아들은 몰래 게임중");
        revealed();
    }

    private void revealed() {
        System.out.println("이게 실행되면 게임중인거 들킴");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.playingGame();
        son.study();
    }


}
