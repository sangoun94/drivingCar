package exerciseTddCalculator_Second_Try;

public class Calculator {
    private Operand operand;
    private Operator operator;
    
    public Calculator(Operand operand, Operator operator) {
        moreOperatorThanOperand(operand, operator);
        this.operand = operand;
        this.operator = operator;
    }

    private void moreOperatorThanOperand(Operand operand, Operator operator) {
        if (operand.getGenerateOperandSize() <= operator.getGenerateOperatorSize()) {
            throw new IllegalArgumentException("연산자의 갯수가 피연산자의 갯수보다 많습니다.");
        }
    }
}
