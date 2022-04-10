package racingCar;

import java.util.Random;

public class Racing {
    private int moveCount;

    public Racing(int moveCount) {
        moveCountCheck(moveCount);
        this.moveCount = moveCount;
    }

    private void moveCountCheck(int moveCount) {
        if (moveCount < 1) {
            throw new IllegalArgumentException("행동 횟수는 0이 아닌 양의 정수입니다.");
        }
    }
    protected void eachCar(int carCount) {
        for (int i = 0; i < carCount; i++) {
            printUnderBar(moveCount);
            System.out.println();
        }
    }

    private void printUnderBar(int moveCount) {
        StringBuilder moveNavigator = new StringBuilder();
        int resultRandomNumber = 0;

        for (int j = 0; j < moveCount; j++) {
            resultRandomNumber = generateRandom();

            navigatorCar(resultRandomNumber, moveNavigator);
        }

        System.out.println(moveNavigator);
    }

    private int generateRandom() {
        int resultRandomNumber;
        Random random = new Random();

        resultRandomNumber = random.nextInt(9);
        return resultRandomNumber;
    }

    private void navigatorCar(int resultRandomNumber, StringBuilder moveNavigator) {

        if (resultRandomNumber >= 4) {
            moveNavigator.append('_');
        }
    }
}
