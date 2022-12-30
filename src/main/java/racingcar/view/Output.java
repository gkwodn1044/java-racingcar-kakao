package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Race;

public class Output {
    public static void printNoticeNameString() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printNoticeTurn() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printCarStatus(Car car) {
        StringBuilder sb = new StringBuilder();

        sb.append(car.getName() + " : ");
        sb.append("-".repeat(car.getPosition()));

        System.out.println(sb);
    }

    public static void printRaceStatus(Race race) {
        for (Car car : race.getCars()) {
            Output.printCarStatus(car);
        }
    }
}
