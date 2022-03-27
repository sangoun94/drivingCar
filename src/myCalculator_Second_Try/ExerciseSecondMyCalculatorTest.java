package myCalculator_Second_Try;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.*;




import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExerciseSecondMyCalculatorTest {

    @Test
    public void plus() {
        ExerciseSecondMyCalculator calculator = new ExerciseSecondMyCalculator(new ExerciseSecondMyOperand(new int[]{1, 2}), new ExerciseSecondMyOperator("+"));
        ExerciseSecondMyCalculation calculation = new ExerciseSecondMyCalculation();
        assertThat(3).isEqualTo(calculation.calculation(calculator));
    }

    @Test
    public void minus() {
        ExerciseSecondMyCalculator calculator = new ExerciseSecondMyCalculator(new ExerciseSecondMyOperand(new int[]{1, 2}), new ExerciseSecondMyOperator("-"));
        ExerciseSecondMyCalculation calculation = new ExerciseSecondMyCalculation();
        assertThat(-1).isEqualTo(calculation.calculation(calculator));
    }

    @Test
    public void multiply() {
        ExerciseSecondMyCalculator calculator = new ExerciseSecondMyCalculator(new ExerciseSecondMyOperand(new int[]{1, 2}), new ExerciseSecondMyOperator("*"));
        ExerciseSecondMyCalculation calculation = new ExerciseSecondMyCalculation();
        assertThat(2).isEqualTo(calculation.calculation(calculator));
    }

    @Test
    public void division() {
        ExerciseSecondMyCalculator calculator = new ExerciseSecondMyCalculator(new ExerciseSecondMyOperand(new int[]{3, 3}), new ExerciseSecondMyOperator("/"));
        ExerciseSecondMyCalculation calculation = new ExerciseSecondMyCalculation();
        assertThat(1).isEqualTo(calculation.calculation(calculator));
    }

    @Test
    public void validationOpertor() {
        ExerciseSecondMyCalculator calculator = new ExerciseSecondMyCalculator(new ExerciseSecondMyOperand(new int[]{3, 3}), new ExerciseSecondMyOperator("/"));
        ExerciseSecondMyOperator operator = new ExerciseSecondMyOperator(calculator);
        assertThrows()
    }

}
