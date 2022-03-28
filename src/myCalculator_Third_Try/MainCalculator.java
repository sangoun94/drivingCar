package myCalculator_Third_Try;

public class MainCalculator {
    public static void main(String[] args) {
        int[] operandArray = {150, 20};
        Operator operator = new Operator("+");
        Operand operand = new Operand(operandArray);
        Calculation plus = new Plus(operator, operand);
        Calculation minus = new Minus(operator, operand);
        Calculation multiply = new Multiply(operator, operand);
        Calculation division = new Division(operator, operand);

        int plusValue = plus.operation();
        int minusValue = minus.operation();
        int multiplyValue = multiply.operation();
        int divisionValue = division.operation();

        System.out.println("plusValue = \"" + plusValue + "\"");
        System.out.println("minusValue = \"" + minusValue + "\"");
        System.out.println("multiplyValue = \"" + multiplyValue + "\"");
        System.out.println("divisionValue = \"" + divisionValue + "\"");
    }
}
