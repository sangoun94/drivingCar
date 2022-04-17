package racingCar2.service;

import java.util.Random;

public class Advance {
    private final Random random = new Random();
    private static final int MAX = 10;

    public Advance() {
    }

    public void forward(Position position) {
        if (isForward()) {
            position.plus();
        }
    }

    private boolean isForward() {
        boolean flag = false;

        flag = getRandom() > 3 ? true :  false;

        return flag;
    }

    private int getRandom() {
        return random.nextInt(MAX);
    }
}
