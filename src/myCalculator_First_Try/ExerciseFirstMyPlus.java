package myCalculator_First_Try;

public class ExerciseFirstMyPlus {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMyPlus(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int plus() {
        return this.firstOperand + this.secondOperand;
    }
}
