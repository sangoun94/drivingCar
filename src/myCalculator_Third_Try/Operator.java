package myCalculator_Third_Try;

public class Operator {
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    public void exceptionCheck() {
        if (operator == null || "".equals(operator)) throw new IllegalArgumentException("연산자를 입력하지 않았습니다.");
    }

    String takeOperator() {
        return this.operator;
    }
}
