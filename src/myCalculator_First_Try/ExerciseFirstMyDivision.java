package myCalculator_First_Try;

public class ExerciseFirstMyDivision {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMyDivision(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int division(){
        return this.firstOperand / this.secondOperand;
    }
}
