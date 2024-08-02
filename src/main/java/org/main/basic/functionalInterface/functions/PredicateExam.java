package org.main.basic.functionalInterface.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * 인터페이스 명 : Predicate<T>
 * 추상메서드 명 : boolean test(T t);
 * API 설명 : 매개값이 조건에 맞는지 평가하여 boolean return
 **/
public class PredicateExam {
    public static void main(String[] args) {
        Kitchen[] kitchens = {
                new Kitchen("Korean", 80),
                new Kitchen("Chinese", 100),
                new Kitchen("Japanes", 50),
                new Kitchen("American", 150),
                new Kitchen("European", 100)
        };

        IntPredicate isPass = (info) -> {
            return info > 100;
        };

        List<Kitchen> kitchenInfos = Arrays.asList(kitchens);

        for (Kitchen kitchenInfo : kitchenInfos) {
            String type = kitchenInfo.type;
            int capacity = kitchenInfo.capacity;

            boolean isPassedCapacity = isPass.test(capacity);

            if (isPassedCapacity) {
                System.out.println(type + "주방은 수용가능한 인력을 갖춘 주방입니다.");
            } else {
                System.out.println(type+"주방은 수용가능한 인력을 갖추지 못했습니다.");
            }
        }

    }

    static class Kitchen{
        String type;
        int capacity;

        public Kitchen(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }
}
