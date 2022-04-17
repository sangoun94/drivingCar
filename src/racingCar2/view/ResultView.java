package racingCar2.view;

import racingCar2.service.Car;

import java.util.List;

public class ResultView {
    public ResultView() {

    }

    public void resultPrint(List<Car> cars) {
        for (Car car : cars
        ) {
            List<Integer> positions = car.takePosition().takePositions();
            Integer position = positions.get(positions.size() - 1);

            for (int i = 0; i < position; i++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
