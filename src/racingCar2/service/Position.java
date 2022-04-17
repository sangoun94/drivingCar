package racingCar2.service;

import java.util.*;

public class Position {
    private List<Integer> positions;

    public Position(List<Integer> positions) {
        this.positions = positions;
        this.positions.add(0);
    }

    void plus() {
        positions.add(positions.size());
    }

    public List<Integer> takePositions() {
        return positions;
    }
}
