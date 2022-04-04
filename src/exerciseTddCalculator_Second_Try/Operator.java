package exerciseTddCalculator_Second_Try;

import java.util.Arrays;

public class Operator {
    private String[] operators;
    private String[] arithmeticOperator = {"+","-","*","/"};

    public Operator(String[] operators) {
        arithmeticOperatorArgumentCheck(operators);
        this.operators = operators;
    }

    private void arithmeticOperatorArgumentCheck(String[] operators) {
        for (String operator: operators) {
            if (!Arrays.stream(arithmeticOperator).anyMatch(operator::equals)) {
                throw new IllegalArgumentException("사칙연산외에 문자는 사용할 수 없습니다.");
            }
        }
    }

    public int getGenerateOperatorSize() {
        return operators.length;
    }
}
