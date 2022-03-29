package exerciseTddCalculator_First_Try;

abstract class ArithmeticOperation {
    private Operand arithmeticOperand;

    public ArithmeticOperation(Operand operand) {
        this.arithmeticOperand = operand;
    }

    protected Operand takeArithmeticOperand() {
        return this.arithmeticOperand;
    }
    abstract int operation();
}
