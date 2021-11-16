package racingcar;

import java.util.ArrayList;

public class Game {
    private static ArrayList<Car> racingCar;
    private static ArrayList<String> winners = new ArrayList<String>();
    private int trial = 0;
    public Game(ArrayList<Car> racingCar, int trial) {
        this.racingCar = racingCar;
        this.trial = trial;
    }
    public void printCarPosition() {
        for(int i = 0; i < racingCar.size(); i++) {
            System.out.println(racingCar.get(i).getName() + " : " + racingCar.get(i).getPosition());
        }
    }
    public void run() {
        for(int i = 0; i < racingCar.size(); i++) {
            racingCar.get(i).isForwardOrBackward();
        }
    }
    public void calculate() {
        // int max = 0;
        // List<int> indexes = ArrayList<int>();
        // int maxIndex = 0;
        // for(int i = 0; i < racingCar.size(); i++) {
        //     int temp = racingCar.get(i).getPosition();
        //     if(max < temp) {
        //         max = temp;
        //         // if(winners.size() > 0)
        //         //     winners.clear();
        //         winners.add(racingCar.get(i).getName());
        //         continue;
        //     }
        //     if(max == temp) {
        //         winners.add(racingCar.get(i).getName());
        //         continue;
        //     }
        // }
        int position = racingCar.get(0).getPosition();
        for(int i = 1; i < racingCar.size(); i++) {
            position = Math.max(position, racingCar.get(i).getPosition());
        }
        for(int i = 0; i < racingCar.size(); i++ ) {
            if(racingCar.get(i).getPosition() == position) {
                winners.add(racingCar.get(i).getName());
            }
        }
    }
    public void start() {
        System.out.println("Game result");
        for(int i = 0; i < trial; i++) {
            run();
            printCarPosition();
        }
        calculate();
        System.out.print("final winner : ");
        for(int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if(i != winners.size())
                System.out.print(", ");
        }
    }
}
