package exerciseTddCalculator_Second_Try;

public class Operand {
    private int[] operands;

    public Operand(int[] operands) {
        operandArgumentCheck(operands);
        this.operands = operands;
    }

    private void operandArgumentCheck(int[] operands) {
        if (operands.length < 2) {
            throw new IllegalArgumentException("피연산자의 수는 2개 이상입니다.");
        }
    }

    public int getGenerateOperandSize() {
        return operands.length;
    }

    public int[] getOperands() {
        return operands;
    }
}
