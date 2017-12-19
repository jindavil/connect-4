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
                System.out.println(" It's red palers turn");
                field.dropRed();
                field.drawFild();
                countmovesfirstplayer = countmovesfirstplayer + 1;
            } else {
                System.out.println(" ");
                System.out.println(" It's black palers turn");
                field.dropBlack();
                field.drawFild();
                coutnmovessecondplayer = coutnmovessecondplayer + 1;
            }
            if ( field.winnercheck() != 2 ) {
                if (field.winnercheck() == 3) {
                    System.out.println("Red won.");
                    win=false;
                } else if (field.winnercheck() == 8) {
                    System.out.println("Black won.");
                    win= false;
                }
            }
        }
        System.out.print(" Player made moves:");
        System.out.println(countmovesfirstplayer);
    }
}