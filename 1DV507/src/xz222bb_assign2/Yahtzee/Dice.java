package xz222bb_assign2.Yahtzee;

import java.util.Random;

public class Dice {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }
}
