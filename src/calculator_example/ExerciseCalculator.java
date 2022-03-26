package calculator_example;

public class ExerciseCalculator {
    private String[] operatorType = {"/", "*", "+", "-"};

    public int calculator(String formula){
        String[] input = formula.split(" ");
        int result = Integer.parseInt(input[0]);
        String operator = null;

        for (int i = 1; i < input.length; i++) {
            if (isPermittedOperated(input[i])) {
               operator = input[i];
            } else {
               result = partCalculator(operator, result, input[i]);
            }
        }
        return result;
    }

    public int partCalculator(String operator, int result, String input) {
        if(input == null || "".equals(input)) throw new IllegalArgumentException();

        switch (operator) {
            case "/":
                return division(result, input);
            case "+":
                return add(result, input);
            case "-":
                return minus(result, input);
            case "*":
                return multiply(result, input);
            default:
                throw new IllegalArgumentException();
        }
    }

    public int minus(int result, String input) {
        return result - Integer.parseInt(input);
    }

    public int multiply(int result, String input) {
        return result * Integer.parseInt(input);
    }

    public int add(int result, String input) {
        return result + Integer.parseInt(input);
    }

    public int division(int result, String input) {
        return result / Integer.parseInt(input);
    }

    private boolean isPermittedOperated(String input) {
        for (String operator : operatorType) {
            if(input.equals(operator)) return true;
        }
        return false;
    }

}
