package exerciseTddCalculator_Second_Try;

import java.util.ArrayList;
import java.util.Arrays;
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

        divisionCheckRunner(operands);
    }

    private void divisionCheckRunner(int[] operands) {
        for (Map.Entry<Integer,String> entry : indexAndOperator.entrySet()) {
            int index = entry.getKey().intValue();
            String value = entry.getValue();

            divisionCheckZeroException(operands, index, value);
        }
    }

    private void divisionCheckZeroException(int[] operands, int index, String value) {
        if (value.equals("/")) {
            for (int i = 0; i < operands.length - 1; i++) {
                if (i == index && operands[i+1] == 0) {
                    throw new IllegalArgumentException("0으로 나누기를 할 수 없습니다.");
                }
            }
        }
    }

    private void moreOperatorThanOperand(Operand operand, Operator operator) {
        if (operand.getGenerateOperandSize() <= operator.getGenerateOperatorSize()) {
            throw new IllegalArgumentException("연산자의 갯수가 피연산자의 갯수보다 많습니다.");
        }
    }

    public int polynomial() {
        int returnOperation = 0;


        return polynomialOperation();
    }

    private int polynomialOperation() {
        int returnValue = 0;

        for (Map.Entry<Integer,String> entry: indexAndOperator.entrySet()) {
            int index = entry.getKey().intValue();
            String value = entry.getValue();

            returnValue = getReturnOperation(index, value);
        }
        return returnValue;
    }

    private int getReturnOperation(int index, String value) {
        int returnValue = 0;
        ArrayList<Integer> operandList = new ArrayList<>();
        ArrayList<Integer> operatorList = new ArrayList<>();

        getOperandList(operandList);
        getOperandList(operatorList);

        for (int i = 0; i < operandList.size() - 1; i++) {
            int preOperand = operandList.get(i);
            int sufOperand = operandList.get(i+1);

            if (value.equals("/") && i == index) {
                returnValue = preOperand / sufOperand;
            } else if (value.equals("+") && i == index) {
                returnValue = preOperand + sufOperand;
            } else if (value.equals("-") && i == index) {
                returnValue = preOperand - sufOperand;
            } else if (value.equals("*") && i == index) {
                returnValue = preOperand * sufOperand;
            }

            operandList.remove(i);
            operandList.remove(i+1);
            operandList.add(returnValue);
        }
        return returnValue;
    }

    private void getOperandList(ArrayList<Integer> list) {
        for (int getInt:operand.getOperands()) {
            list.add(getInt);
        }
    }
}
