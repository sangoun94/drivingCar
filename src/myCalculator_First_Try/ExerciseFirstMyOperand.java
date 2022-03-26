package myCalculator_First_Try;

public class ExerciseFirstMyOperand {
    private int firstOperand;
    private int secondOperand;

    public ExerciseFirstMyOperand(int firstOperand, int secondOperand) {
        if(firstOperand == 0 || secondOperand == 0) throw new IllegalArgumentException();
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
}

