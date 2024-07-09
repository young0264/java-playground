package org.main.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class ReferenceTypeTest {

    @Test
    void arrayCopyWithFor() {
        int[] oldIntArr = {1, 2, 3};
        int[] newIntArr = new int[5];

        for (int i = 0; i < oldIntArr.length; i++) {
            newIntArr[i] = oldIntArr[i];
        }

        for (int i = 0; i < newIntArr.length; i++) {
            System.out.print(newIntArr[i]+",");
        }
    }

    @Test
    void arrayCopyWithSystemCopy() {
        String[] oldStrArr = {"java", "array", "copy"};
        String[] newStrArr = new String[5];

        System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

        for (int i = 0; i < newStrArr.length; i++) {
            System.out.print(newStrArr[i]+", ");
        }
    }

    @Test
    void upgradeForLoopWithStream() {
        int[] scores = {95, 71, 84, 93, 87};
        List<Integer> integers = List.of(95, 71, 84, 93, 87);

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        int sum1 = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        int sum2 = Arrays.stream(scores).sum();

        assertThat(sum).isEqualTo(sum1);
        assertThat(sum1).isEqualTo(sum2);
    }

    @Test
    void isSameEnumMemoryAddress() {
        Week friday = Week.FRIDAY;
        assertThat(friday).isSameAs(Week.FRIDAY);
    }

    @Test
    void usingEnumMethodTest() {
        assertThat(Week.MONDAY.name()).isEqualTo("MONDAY");
        assertThat(Week.MONDAY.ordinal()).isEqualTo(0);
        assertThat(Week.FRIDAY.compareTo(Week.MONDAY)).isEqualTo(4);
        assertThat(Week.valueOf("MONDAY")).isEqualTo(Week.MONDAY);
        assertThat(Week.values().length).isEqualTo(7);
    }

    private enum Week{
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
