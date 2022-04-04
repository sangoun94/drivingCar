package exerciseTddCalculator_Second_Try;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestOperator {

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
}
