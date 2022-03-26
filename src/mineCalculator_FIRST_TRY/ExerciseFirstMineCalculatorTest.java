package mineCalculator_FIRST_TRY;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class ExerciseFirstMineCalculatorTest {


    @Test
    public void minus() {
        assertThat(4).isEqualTo(new ExerciseFirstMineMinus(10, 6).minus());
    }

    @Test
    public void plus() {
        assertThat(16).isEqualTo(new ExerciseFirstMinePlus(10, 6).plus());
    }

    @Test
    public void multiplication() {
        assertThat(60).isEqualTo(new ExerciseFirstMineMultiplication(10, 6).multiplication());
    }

    @Test
    public void division() {
        assertThat(1).isEqualTo(new ExerciseFirstMineDivision(10, 6).division());
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,0"})
    public void operand(int input, int input2) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            assertThat(11).isEqualTo(new ExerciseFirstMineOperand(input, input2));
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"/", "8"})
    public void operator(String inputOperator) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            assertThat("/").isEqualTo(new ExerciseFirstMineOperator(inputOperator));
        });
    }
}
