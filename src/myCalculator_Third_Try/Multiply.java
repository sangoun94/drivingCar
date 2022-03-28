package myCalculator_Third_Try;

public class Multiply extends Calculation{
    public Multiply(Operator operator, Operand operand) {
        super(operator, operand);
    }

    @Override
    int operation() {
        for (int i = 0; i < operand.takeOperand().length; i++) {
            if(i != operand.takeOperand().length - 1)
                calculationResultValue = operand.takeOperand()[i] * operand.takeOperand()[i + 1];
        }

        return calculationResultValue;
    }
}
