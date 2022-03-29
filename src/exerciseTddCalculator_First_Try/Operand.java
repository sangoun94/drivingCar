package exerciseTddCalculator_First_Try;

public class Operand {
    private int[] operands;

    public Operand(int[] operands) {
        this.operands = operands;
    }

    public int[] takeOperand() {
        return this.operands;
    }

    public void checkZero(int postOperand) {
        if(postOperand  == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
    }

    public void checkSize() {
        if (operands.length < 2) {
            throw new IllegalArgumentException("피연산자 2개 이상 입력해주세요.");
        }
    }
}
