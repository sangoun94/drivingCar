package myCalculator_Third_Try;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestCalculator {

    @Test
    void 연산자_예외_테스트() {
        CalculatorException exception = new CalculatorException();
        Operator operator = new Operator(null);
        //Operator operator = new Operator("");
        //Operator operator = new Operator("^");

        assertThatThrownBy(() -> exception.operatorExceptionCheck(operator))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 피연산자_예외_테스트() {
        CalculatorException exception = new CalculatorException();
        Operand operand = new Operand(new int[]{1});
        //Operand operand = new Operand(new int[]{1, 2, 3});

        assertThatThrownBy(() -> exception.operandExceptionCheck(operand))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산해야할 피연산자가 부족합니다.")
                .hasMessageContaining("피연산자");
    }

    @Test
    void 통합_예외_테스트() {
        CalculatorException exception = new CalculatorException();
        Operator operator = new Operator("");
        Operand operand = new Operand(new int[]{1,2});
        //Operator operator = new Operator("22");
        assertThatThrownBy(() -> exception.exceptionCheck(operator, operand))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산자를 입력하지 않았습니다.");
    }

    @Test
    void 덧셈_테스트() {
        Calculation calculation = new Plus(new Operator("+"), new Operand(new int[]{2, 3}));
        assertThat(5).isEqualTo(calculation.operation());
    }

    @Test
    void 뺄셈_테스트() {
        Calculation calculation = new Minus(new Operator("+"), new Operand(new int[]{2, 3}));
        assertThat(-1).isEqualTo(calculation.operation());
    }

    @Test
    void 곱셈_테스트() {
        Calculation calculation = new Multiply(new Operator("+"), new Operand(new int[]{2, 3}));
        assertThat(6).isEqualTo(calculation.operation());
    }

    @Test
    void 나눗셈_테스트() {
        Calculation calculation = new Division(new Operator("+"), new Operand(new int[]{2, 3}));
        assertThat(0).isEqualTo(calculation.operation());
    }

    @Test
    void 연산_생성시_연산자_예외_테스트() {
        assertThatThrownBy(() -> new Division(new Operator(""), new Operand(new int[]{2, 3})))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산자를 입력하지 않았습니다.");
    }

    @Test
    void 연산_생성시_피연산자_예외_테스트() {
        assertThatThrownBy(() -> new Division(new Operator("*"), new Operand(new int[]{3})))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("피연산자");
    }

}
