package org.main.basic.generic;

import org.main.basic.generic.InheritanceClass.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericInheritance {

    /** 하한 경계 */
    Box<? extends Fruit> box1_1 = new Box<Fruit>();
    Box<? extends Fruit> box2_1 = new Box<Apple>();
    Box<? extends Fruit> box3_1 = new Box<Banana>();

    /** 상한 경계 */
    Box<? super Fruit> box1_2 = new Box<Fruit>();
    Box<? super Fruit> box2_2 = new Box<Food>();
    Box<? super Fruit> box3_2 = new Box<Object>();

    /** 비경계 */
    Box<?> box1_3 = new Box<Vegetable>();
    Box<?> box2_3 = new Box<Fruit>();
    Box<?> box3_3 = new Box<Food>();
    Box<?> box3_3_2 = new Box<Carrot>();

    public static void main(String[] args) {
        System.out.println(123);
        List<Banana> bananas = new ArrayList<>(
                Arrays.asList( new Banana(), new Banana(), new Banana())
        );
        FruitBox.method(bananas);
    }


}
