package myCalculator_Third_Try;

public class CalculatorException {
    public void exceptionCheck(Operator operator, Operand operand) {
        operandExceptionCheck(operand);
        operatorExceptionCheck(operator);
    }

    public void operandExceptionCheck(Operand operand) {
        operand.operandLengthCheck();
    }

    public void operatorExceptionCheck(Operator operator) {
        operator.exceptionCheck();
    }
}
