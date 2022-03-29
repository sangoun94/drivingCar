package exerciseTddCalculator_First_Try;

public class Plus extends ArithmeticOperation{

    public Plus(Operand operand) {
        super(operand);
    }

    @Override
    int operation() {
        int resultValue = 0;

        for (int i = 0; i < takeArithmeticOperand().takeOperand().length - 1; i++) {
            resultValue = takeArithmeticOperand().takeOperand()[i] + takeArithmeticOperand().takeOperand()[i + 1];
        }

        return resultValue;
    }
}
