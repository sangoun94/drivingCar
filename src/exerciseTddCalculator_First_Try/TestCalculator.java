package exerciseTddCalculator_First_Try;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
/*GENERATE*/
    @Test
    public void 계산기생성() {
        assertThatThrownBy(() -> new Calculator(new Operand(new int[]{5}), new Operator(new String[]{"+"})))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("피연산자");
    }

/*TAKE DATA*/
    @Test
    public void takeOperators() {
        Operator operator = new Operator(new String[]{"+", "-"});
        assertThat(new String[]{"+","-"}).isEqualTo(operator.takeOperator());
    }
//
//    @Test
//    public void seperateOperator() {
//        Calculator calculator = new Calculator(new int[]{5, 3, 2}, new String[]{"+", "-"});
//        calculator.oper
//    }
//
    @Test
    public void takeOperands() {
        Operand operand = new Operand(new int[]{5, 3, 2});
        assertThat(new int[]{5,3,2}).isEqualTo(operand.takeOperand());
    }

//
//    @Test
//    public void plus() {
//        Plus plus = new Plus(new Operand(new int[]{5, 3, 2}));
//
//        assertThat(6).isEqualTo(plus.plus());
//    }


/*CALCULATOR*/
    @Test
    public void calculatorPlus() {
        Calculator calculator = new Calculator(new Operand(new int[]{5,3}), new Operator(new String[]{"+"}));

        assertThat(8).isEqualTo(calculator.calculation());
    }

    @Test
    public void calculatorMinus() {
        Calculator calculator = new Calculator(new Operand(new int[]{5,3}), new Operator(new String[]{"-"}));

        assertThat(2).isEqualTo(calculator.calculation());
    }

    @Test
    public void calculatorMultiply() {
        Calculator calculator = new Calculator(new Operand(new int[]{5,3}), new Operator(new String[]{"*"}));

        assertThat(15).isEqualTo(calculator.calculation());
    }

    @Test
    public void calculatorDivision() {
        Calculator calculator = new Calculator(new Operand(new int[]{5,3}), new Operator(new String[]{"/"}));

        assertThat(1).isEqualTo(calculator.calculation());
    }

/*EXCEPTION*/
    @Test
    public void 피연산자크기() {
        Operand operand = new Operand(new int[]{5});
        assertThatThrownBy(() -> operand.checkSize())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("피연산자");
    }

    @Test
    public void 제로로나누기() {
        Calculator calculator = new Calculator(new Operand(new int[]{5, 0}), new Operator(new String[]{"/"}));

        assertThatThrownBy(() -> calculator.calculation())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("0으로");
    }
}
