package racingCar2.service;

import java.util.*;

public class Car {
    private Position position;

    public Car() {
        this.position = new Position(new ArrayList<Integer>());
    }

    void move() {
        Advance advance = new Advance();

        advance.forward(this.position);
    }

    public Position takePosition() {
        return this.position;
    }
}
