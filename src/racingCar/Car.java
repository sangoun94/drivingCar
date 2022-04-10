package racingCar;

import java.util.Random;

public class Car {
    private int count;

    public Car(int count) {
        carCountCheck(count);
        this.count = count;
    }

    private void carCountCheck(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("0이 아닌 양의정수를 입력해주세요");
        }
    }

    public void move(int moveCount) {
        //차 각각
        Racing racing = new Racing(moveCount);
        racing.eachCar(count);
    }


}
