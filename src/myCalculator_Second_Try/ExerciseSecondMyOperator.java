package myCalculator_Second_Try;

public class ExerciseSecondMyOperator {
    String operator;

    public ExerciseSecondMyOperator(ExerciseSecondMyCalculator calculator) {
        this.operator = calculator.operator;
    }

    public ExerciseSecondMyOperator(String operator) {
        this.operator = operator;
    }

    public void validationOperator(ExerciseSecondMyCalculator calculator) {
        if(calculator.operator == null || "".equals(calculator.operator)) throw new IllegalArgumentException("파라미터 값이 없습니다.");
    }

    int quarterOperator(ExerciseSecondMyCalculator calculator) {
        int result = 0;



        if ("+".equals(calculator.operator)) {
            result = new ExerciseSecondMyPlus().plus(calculator);
        } else if ("-".equals(calculator.operator)) {
            result = new ExerciseSecondMyMinus().minus(calculator);
        } else if ("*".equals(calculator.operator)) {
            result = new ExerciseSecondMyMultiplication().multiplication(calculator);
        } else if ("/".equals(this.operator)) {
            result = new ExerciseSecondMyDivision().division(calculator);
        }
        return result;
    }
}
