package myCalculator_Second_Try;

public class ExerciseSecondMyCalculation extends ExerciseSecondMyCalculator{

    protected ExerciseSecondMyCalculation(ExerciseSecondMyOperand operand, ExerciseSecondMyOperator operator) {
        super(operand, operator);
    }

    public ExerciseSecondMyCalculation() {
        super();
    }

    public int calculation(ExerciseSecondMyCalculator calculator) {
        ExerciseSecondMyOperator operator = new ExerciseSecondMyOperator(calculator);
        return operator.quarterOperator(calculator);
    }
}
