package mineCalculator_FIRST_TRY;

public class ExerciseFirstMineOperator {
    private String[] operatorArr = {"/","*","+","-"};
    private String resultOperator = null;

    public ExerciseFirstMineOperator(String inputOperator) {
        for (String operator : operatorArr) {
            if (inputOperator.equals(operator)) this.resultOperator = operator;
        }
        if(this.resultOperator == null) throw new IllegalArgumentException();
    }
}
