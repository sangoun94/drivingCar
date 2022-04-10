package racingCar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestRacing {

    @Test
    public void 움직임횟수() {
        assertThatThrownBy(() -> {
            new Racing(-1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("행동 횟수는 0이 아닌 양의 정수입니다.");
    }

//    @Test
//    public void

}
