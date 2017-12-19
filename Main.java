package shaffel1;
public class Main {
    public static void main(String[] args) {
        playerChoice playerChoice= new playerChoice();
        modechoice gamemode=new modechoice();
        gamemode.setMod1(playerChoice.setPlayingmod());
        Game newGame= new Game();
	    newGame.gameRun();
    }
}
