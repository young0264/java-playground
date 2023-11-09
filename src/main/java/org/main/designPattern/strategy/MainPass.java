package org.main.designPattern.strategy;

public class MainPass {
    public static void main(String[] args) {

        Kitchen kitchen = null;
        Chef chef = new Chef();

        kitchen = new ChineseKitchen();
        chef.cook(kitchen);

        kitchen = new DiningKitchen();
        chef.cook(kitchen);

        kitchen = new TempleKitchen();
        chef.cook(kitchen);
    }
}
