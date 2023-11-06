package org.main.reflect.v2;

public class Son2 {

    private String name;
    private int age;
    private String address;

    public Son2(String name, int i, String address) {
        this.name = name;
        this.age = i;
        this.address = address;
    }

    public Son2() {
    }

    void study() {
        System.out.println("옆집 아들은 공부중");
    }

    public void fact() {
        System.out.println("옆집아들이 몰래 게임하는거 몰라");
    }

    protected void playingGame() {
        System.out.println("옆집 아들2도 몰래 게임중");
        revealed();
    }

    private void revealed() {
        System.out.println("이게 실행되면 옆집 아들도 게임중인거 들킴");
    }

    public static void main(String[] args) {
        Son2 son2 = new Son2();
        son2.playingGame();
        son2.study();
    }


}
