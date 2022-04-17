package racingCar2.excute;

import racingCar2.service.RacingGame;
import racingCar2.view.InputView;

public class MainRacingGame {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingGame racingGame = new RacingGame(inputView.takeCarCount());

        racingGame.start(inputView.takeRoundCount());
    }
}
