package shaffel1;

public class Game {
    public void gameRun() {
        Field field = new Field();
        field.drawFild();
        int countmovesfirstplayer = 0;
        int coutnmovessecondplayer = 0;
        boolean win = true;
        while (win == true) {
            if (countmovesfirstplayer == coutnmovessecondplayer) {
                field.dropRed();
                field.drawFild();
                countmovesfirstplayer = countmovesfirstplayer + 1;
            } else {
                System.out.println(" ");
                field.dropBlack();
                field.drawFild();
                coutnmovessecondplayer = coutnmovessecondplayer + 1;
            }
            win=field.winnercheck();

            // Winner Check

        }
        System.out.println(" hi you win");
    }
}
