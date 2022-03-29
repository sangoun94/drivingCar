package exerciseTddCalculator_First_Try;

public class Calculator {
    private Operand operand;
    private Operator operator;
    private int calculationResultValue = 0;
    private ArithmeticOperation arithmeticOperation = null;

    public Calculator(Operand operand, Operator operator) {
        operand.checkSize();
        this.operand = operand;
        this.operator = operator;
    }

    public int calculation() {
        for (String operator:
                operator.takeOperator()) {
            calculationResultValue = seperateOperator(operator);
        }
        return calculationResultValue;
    }

    private int seperateOperator(String operator){
        if ("+".equals(operator)) {
            arithmeticOperation = new Plus(operand);
        } else if ("-".equals(operator)) {
            arithmeticOperation = new Minus(operand);
        } else if ("*".equals(operator)) {
            arithmeticOperation = new Multiply(operand);
        } else if ("/".equals(operator)){
            arithmeticOperation = new Division(operand);
        }
        return arithmeticOperation.operation();
    }
}
