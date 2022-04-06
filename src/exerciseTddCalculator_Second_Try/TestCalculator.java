package exerciseTddCalculator_Second_Try;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
    //Operator operator = new Operator(new String[]{"/", "+", "*", "-"});
    Operator operator = new Operator(new String[]{"/", "+", "*"});
    Operand operand = new Operand(new int[]{1, 1, 3, 4});

    @Test
    public void 계산기생성_인수_예외처리() {
        assertThatThrownBy(() -> {
            new Calculator(operand, operator);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산자의 갯수가 피연산자의 갯수보다 많습니다.");
    }

    @Test
    public void 나누기예외() {
        assertThatThrownBy(() -> {
            new Calculator(operand, operator);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0으로 나누기를 할 수 없습니다.");
    }

    @Test
    public void 다항연산() {
        Calculator calculator = new Calculator(operand, operator);

        assertThat(13).isEqualTo(calculator.polynomialOperation());
    }
}
