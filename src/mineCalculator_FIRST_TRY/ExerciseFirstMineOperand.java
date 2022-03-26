package mineCalculator_FIRST_TRY;

public class ExerciseFirstMineOperand {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMineOperand(int firstOperand, int secondOperand) {
        if(firstOperand == 0 || secondOperand == 0) throw new IllegalArgumentException();
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}

