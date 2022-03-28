package myCalculator_Third_Try;

public abstract class Calculation extends Calculator{
    CalculatorException exception = new CalculatorException();
    int calculationResultValue = 0;

    public Calculation(Operator operator, Operand operand) {
        super(operator, operand);
        exception.exceptionCheck(operator, operand);
    }

    abstract int operation();
}
