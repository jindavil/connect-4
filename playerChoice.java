package shaffel1;

import java.util.Scanner;

public class playerChoice {
    public int setPlayingmod() {
        System.out.println(" 1 - P vs P");
        System.out.println(" 2 - P vs PC");
        System.out.println(" 3 - PC vs P");
        System.out.println(" 4 - PC vs PC");
        int playingmod = 0;
        while ((playingmod > 4) || (playingmod < 1)) {
            Scanner scanner = new Scanner(System.in);
            playingmod = scanner.nextInt();
            if (playingmod == 0) {
                System.out.println("There's no suche mode");
            } else if (playingmod > 4) {
                System.out.println("Your number is too big");
            }
        }
        return playingmod;
    }
}

