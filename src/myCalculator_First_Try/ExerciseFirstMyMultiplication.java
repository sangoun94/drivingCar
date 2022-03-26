package myCalculator_First_Try;

public class ExerciseFirstMyMultiplication {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMyMultiplication(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int multiplication() {
        return this.firstOperand * this.secondOperand;
    }
}
