package exerciseTddCalculator_Second_Try;

import java.util.Map;

public class Calculator {
    private Operand operand;
    private Operator operator;
    private Map<Integer, String> indexAndOperator = operator.getIndexAndOperator();
    
    public Calculator(Operand operand, Operator operator) {
        moreOperatorThanOperand(operand, operator);
        noDivisionZero(operand, operator);

        this.operand = operand;
        this.operator = operator;
    }

    private void noDivisionZero(Operand operand, Operator operator) {
        int[] operands = operand.getOperands();

        for (Map.Entry<Integer,String> entry : indexAndOperator.entrySet()) {
            int index = entry.getKey().intValue();
            String value = entry.getValue();

            if (value.equals("/")) {
                for (int i = 0; i < operands.length - 1; i++) {
                    if (i == index && operands[i+1] == 0) {
                        throw new IllegalArgumentException("0으로 나누기를 할 수 없습니다.");
                    }
                }
            }
        }
    }

    private void moreOperatorThanOperand(Operand operand, Operator operator) {
        if (operand.getGenerateOperandSize() <= operator.getGenerateOperatorSize()) {
            throw new IllegalArgumentException("연산자의 갯수가 피연산자의 갯수보다 많습니다.");
        }
    }

    public int polynomialOperation() {
        int returnOperation = 0;

        for (Map.Entry<Integer,String> entry: indexAndOperator.entrySet()) {
            int index = entry.getKey().intValue();
            String value = entry.getValue();

            for (int i = 0; i < operand.getGenerateOperandSize() - 1; i++) {
                int preOperand = this.operand.getOperands()[i];
                int sufOperand = this.operand.getOperands()[i + 1];

                if (value.equals("/") && i == index) {
                    returnOperation = preOperand / sufOperand;
                } else if (value.equals("+") && i == index) {
                    returnOperation = preOperand + sufOperand;
                } else if (value.equals("-") && i == index) {
                    returnOperation = preOperand - sufOperand;
                } else if (value.equals("*") && i == index) {
                    returnOperation = preOperand * sufOperand;
                }

            }
        }

        return returnOperation;
    }
}
