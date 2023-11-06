package org.main.next;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class nextTest {

    @Test
    public void next는_공백앞까지만_입력을받는다() {

        Scanner scanner = new Scanner("가나다 라마바");
        String str = scanner.next();
        Assertions.assertThat(str).isEqualTo("가나다");
    }

    @Test
    public void nextLine은_공백까지_입력을받는다() {

        Scanner scanner = new Scanner("가나다 라마바");
        String str = scanner.nextLine();
        Assertions.assertThat(str).isEqualTo("가나다 라마바");
    }

}
