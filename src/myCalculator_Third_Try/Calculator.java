package myCalculator_Third_Try;

class Calculator {
    protected Operator operator;
    protected Operand operand;

    public Calculator(Operator operator, Operand operand) {
        this.operator = operator;
        this.operand = operand;
    }
}
