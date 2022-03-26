package myCalculator_First_Try;

public class ExerciseFirstMyMinus {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMyMinus(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int minus() {
        return this.firstOperand - this.secondOperand;
    }
}
