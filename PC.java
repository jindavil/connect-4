package shaffel1;

import java.util.Random;

public class  PC extends Player{
    public int number() {
        Random randomnumber = new Random();
        int number = randomnumber.nextInt(7) + 1;
        return number;
    }
}


