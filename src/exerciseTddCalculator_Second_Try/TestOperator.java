package exerciseTddCalculator_Second_Try;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class TestOperator {
    Map<Integer, String> map = new HashMap<>();

    @Test
    public void 연산자생성_사칙연산_예외처리() {
        assertThatThrownBy(() -> {
            new Operator(new String[]{"+","-","*","/","**"});
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사칙연산외에 문자는 사용할 수 없습니다.");
    }

    @Test
    public void 연산자개수() {
        Operator operator = new Operator(new String[]{"+", "+", "+", "+", "+"});

        assertThat(5).isEqualTo(operator.getGenerateOperatorSize());
    }

    @Test
    public void 연산자우선순위() {
        map.put(0, "+");
        map.put(1, "*");
        map.put(2, "/");
        map.put(3, "-");

        Operator operator = new Operator(new String[]{"+", "*", "/", "-"});

        assertThat(map).isEqualTo(operator.getIndexAndOperator());
    }
}
