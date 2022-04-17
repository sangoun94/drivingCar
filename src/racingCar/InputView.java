package racingCar;

import java.util.Scanner;

public class InputView {
    private final static Scanner scanner = new Scanner(System.in);
    private Car car;

    public InputView() {
        int carCount = 0;
        int roundCount = 0;

        carCount = getCount("차량 수를 입력해주세요");
        roundCount = getCount("몇 라운드로 진행할까요?");

        this.car = new Car(carCount);

        this.car.move(roundCount);
    }

    private int getCount(String s) {
        int count;

        printInput(s);
        count = scanner.nextInt();
        return count;
    }

    private void printInput(String printString) {
        System.out.println(printString);
    }
}
