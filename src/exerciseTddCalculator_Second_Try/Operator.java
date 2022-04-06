package exerciseTddCalculator_Second_Try;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Operator {
    private String[] operators;
    private String[] arithmeticOperator = {"+","-","*","/"};
    private String num = "";


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

    public Map<Integer, String> getIndexAndOperator() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < operators.length; i++) {
            map.put(i, operators[i]);
        }
        return map;
    }
}
