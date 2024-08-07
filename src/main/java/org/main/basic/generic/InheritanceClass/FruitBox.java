package org.main.basic.generic.InheritanceClass;

import java.util.List;

public class FruitBox {
    public static void method(List<? extends Fruit> item) {
        System.out.println("method start");
        // 안전하게 꺼내려면 Fruit 타입으로만 받아야한다
        Fruit f1 = item.get(0);
        Apple f2 = (Apple) item.get(0); // ! 잠재적 ERROR
        Banana f3 = (Banana) item.get(0); // ! 잠재적 ERROR
    }
}
