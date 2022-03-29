package exerciseTddCalculator_First_Try;

public class Operator {
    private String[] operators;

    public Operator(String[] operators) {
        this.operators = operators;
    }

    public String[] takeOperator() {
        return this.operators;
    }
}
