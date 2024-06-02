package org.main.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.main.designPattern.factoryMethod.animal.Cat;
import java.util.Collections;
import java.util.List;
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

    @Test
    void 가독성좋은_Optional_메서드사용() {

        // AVOID
        Optional<String> optionalName = Optional.of("영");

        if (optionalName.isPresent()) {
            System.out.println("진행 시켜");;
        } else {
            System.out.println("NPE 에러닷");;
        }

        // TO-BE
        optionalName.orElseGet(this::findDefaultName);
    }

    private String findDefaultName() {
        return "제 2안으로 진행시켜~!";
    }

    @Test
    void 단순히_값을_얻기위해사용_지양() {
        String name = "영";
        String newName ;

        // AVOID
        newName = Optional.ofNullable(name).orElse("Default");

        // TO-BE
        newName = name == null ? "영" : "으영";
    }

    @Test
    void Collection_Optional로_감싸지말것() {
        List<Cat> catList = List.of(new Cat(), new Cat());

        // AVOID
        Optional<List<Cat>> catList2 = Optional.ofNullable(catList);

        // TO-BE
        List<Cat> catList3 = catList == null ? Collections.emptyList()
                : catList;
    }
}
