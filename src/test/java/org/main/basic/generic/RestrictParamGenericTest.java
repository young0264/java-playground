package org.main.basic.generic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestrictParamGenericTest {

    public class Util{
        public static <T extends Number> int compare(T t1, T t2){
            double v1 = t1.doubleValue();
            double v2 = t2.doubleValue();
            return Double.compare(v1, v2);
        }
    }

    @Test
    public void BoundedTypeParameterExample() {
//        String str = Util.compare("a", "b"); // 타입 불일치

        int result1 = Util.compare(10, 20); // int -> Integer
        System.out.println(result1);
        int result2 = Util.compare(4.5, 3); // double -> Double
        System.out.println(result2);

        assertThat(result1).isLessThan(0);
        assertThat(result2).isGreaterThan(0);

    }

}
