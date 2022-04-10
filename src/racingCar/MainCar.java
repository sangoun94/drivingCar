package racingCar;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 대의 차량인가요?");
        int carCount = scanner.nextInt();

        System.out.println("차량은 몇 번 움직이나요?");
        int carMoveCount = scanner.nextInt();

        Car car = new Car(carCount);
        car.move(carMoveCount);

    }
}
