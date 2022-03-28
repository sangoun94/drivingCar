package myCalculator_Third_Try;

public class Operand {
    int[] operand;

    public Operand(int[] operand) {
        this.operand = operand;
    }

    int[] takeOperand() {
        return operand;
    }

    void operandLengthCheck() {
        if(operand.length < 2) throw new IllegalArgumentException("연산해야할 피연산자가 부족합니다.");
    }
}
