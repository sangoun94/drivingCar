package racingCar;


import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TestCar {

    @Test
    public void 자동차갯수체크() {
        assertThatThrownBy(() -> {
            new Car(-2);
        }).isInstanceOf(IllegalArgumentException.class)
        .hasMessage("0이 아닌 양의정수를 입력해주세요");
    }

    @Test
    public void 움직임횟수양의정수체크() {
        assertThatThrownBy(() -> {
            new Car(5).move(-1);
        }).isInstanceOf(IllegalArgumentException.class)
        .hasMessage("행동 횟수는 0이 아닌 양의 정수입니다.");
    }
}
