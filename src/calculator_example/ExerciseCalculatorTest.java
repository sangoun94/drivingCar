package calculator_example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class ExerciseCalculatorTest {
    private ExerciseCalculator exerciseCalculator = new ExerciseCalculator();

    @Test
    void addTest() {
        assertThat(5).isEqualTo(exerciseCalculator.add(2, "3"));
    }

    @Test
    void minusTest() {
        assertThat(-1).isEqualTo(exerciseCalculator.minus(2, "3"));
    }

    @Test
    void multiplyTest() {
        assertThat(6).isEqualTo(exerciseCalculator.multiply(2, "3"));
    }

    @Test
    void divisionTest() {
        assertThat(0).isEqualTo(exerciseCalculator.division(2, "3"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"#", "$"})
    void partCalculatePermittedOperatorTest(String input){
        assertThatThrownBy(() -> {
            exerciseCalculator.partCalculator(input, 5, "5");
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @ParameterizedTest
    @NullAndEmptySource
    void partCarculateNullInputTest(String input) {
        assertThatThrownBy(() -> {
            exerciseCalculator.partCalculator("+", 5,input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
