package exerciseTddCalculator_Second_Try;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {

    @Test
    public void 계산기생성_인수_예외처리() {
        Operator operator = new Operator(new String[]{"/", "+", "*", "-"});
        Operand operand = new Operand(new int[]{1, 2, 3, 4});

        assertThatThrownBy(() -> {
            new Calculator(operand, operator);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산자의 갯수가 피연산자의 갯수보다 많습니다.");
    }
}
