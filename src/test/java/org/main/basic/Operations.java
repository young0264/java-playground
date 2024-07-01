package org.main.basic;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class Operations {

    @Test
    void binaryCannotRepresentDecimalAccurately() {
        double a = 0.1;
        double apple = 1;
        double cnt = 7;
        double appleRemain = 3;
        double res = apple - (a * cnt);
        Assertions.assertThat(res).isNotEqualTo(a * appleRemain);
    }

    @Test
    void typePromotionInComparison() {
        int v2 = 1;
        double v3 = 1.0;
//        log.info("v2 == v3 : {}", v2 == v3);
        Assertions.assertThat(v2 == v3).isEqualTo(true);
    }

}
