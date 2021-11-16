package racingcar;

import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    private static ArrayList<Car> raceCar = new ArrayList<Car>();
    public static String[] getCarsName(String input) {
        return input.split(",");
    }
    public static void registerCar(String[] names) {
        for(int i = 0; i < names.length; i++) {
            Car candidate = new Car(names[i]);
            raceCar.add(candidate);
        }
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // System.out.print("Type in car name for race. (comma for name(,) ");
        String carNames = scanner.nextLine();
        System.out.print("what times for try?");
        int trial = scanner.nextInt();

        registerCar(getCarsName(carNames));
        Game game = new Game(raceCar, trial);
        game.start();
        
    }
}
