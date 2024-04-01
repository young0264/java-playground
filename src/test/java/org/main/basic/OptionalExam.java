package org.main.basic;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.main.designPattern.factoryMethod.animal.Cat;
import org.main.designPattern.factoryMethod.cook.Kitchen;

import java.util.Optional;


public class OptionalExam {

    @Test
    void v1() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        Assertions.assertThat(empty).isEqualTo("Optional.empty");
        Assertions.assertThat(empty.isPresent()).isEqualTo(false);
    }

    @Test
    void 변수에_null할당은_NPE유발() {
        Optional<Cat> cat = null;
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> cat.get());
    }
}
