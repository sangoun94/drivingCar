package racingCar2.view;

import lombok.Getter;

import java.util.Scanner;

public class InputView {
    private static final  Scanner scanner = new Scanner(System.in);
    private int carCount;
    private int roundCount;

    public InputView() {
        startInitialization();
        isValidation();
    }

    private void isValidation() {
        if (carCount < 1 || roundCount < 1) {
            throw new IllegalArgumentException("시작할 차량 수와 라운드 수는 양의 정수 입니다.");
        }
    }

    private void startInitialization() {
        System.out.println("차량 수를 입력하세요.");
        this.carCount = scanner.nextInt();
        System.out.println("몇 라운드 진행할까요?");
        this.roundCount = scanner.nextInt();
    }

    public int takeCarCount() {
        return carCount;
    }

    public int takeRoundCount() {
        return roundCount;
    }
}
