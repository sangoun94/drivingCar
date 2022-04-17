package racingCar2.service;

import racingCar2.view.ResultView;

import java.util.*;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public RacingGame(int carCount) {
        initCar(carCount);
    }

    private void initCar(int carCount) {
        for (int i = 0; i < carCount; i++) {
            this.cars.add(new Car());
        }
    }

    public void start(int roundCount) {
        for (int i = 0; i < roundCount; i++) {
            iteratorCar();
        }

        ResultView resultView = new ResultView();
        resultView.resultPrint(this.cars);
    }

    private void iteratorCar() {
        for (Car car : this.cars) {
            car.move();
        }
    }
}
