package myCalculator_First_Try;

public class ExerciseFirstMyOperator {
    private String[] operatorArr = {"/","*","+","-"};
    private String resultOperator = null;

    public ExerciseFirstMyOperator(String inputOperator) {
        for (String operator : operatorArr) {
            if (inputOperator.equals(operator)) this.resultOperator = operator;
        }
        if(this.resultOperator == null) throw new IllegalArgumentException();
    }
}
