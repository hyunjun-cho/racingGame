package racingcar;
import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    private int getNumber() {
        return RandomUtils.nextInt(0, 9);
    }
    public void isForwardOrBackward() {
        if(getNumber() > 3)
            position++;
    }
    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }
}
