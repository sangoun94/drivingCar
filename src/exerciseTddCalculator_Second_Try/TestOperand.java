package exerciseTddCalculator_Second_Try;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestOperand {

    @Test
    public void 피연산자생성() {
        assertThatThrownBy(() -> {
            new Operand(new int[]{1});
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("피연산자의 수는 2개 이상입니다.");
    }

    @Test
    public void 피연산자갯수() {
        Operand operand = new Operand(new int[]{1, 2, 3, 4, 5});

        assertThat(5).isEqualTo(operand.getGenerateOperandSize());
    }
}
