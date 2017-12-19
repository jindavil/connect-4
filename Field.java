package shaffel1;

import java.util.Arrays;

public class Field {
    int bourdsize = 7;
    int[][] basicBoard = new int[bourdsize][bourdsize];

    public void crField() {
        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                basicBoard[i][j] = 0;
            }
        }
    }

    public void drawFild() {
        for (int i = 0; i < basicBoard.length; i++) {
            System.out.println(Arrays.toString(basicBoard[i]));
        }
    }

    public void dropRed() {
        modechoice modechoice = new modechoice();
        int k = 0;
        if ((modechoice.getMod1() == 1) || (modechoice.getMod1() == 2)) {
            Player moveHuman = new Human();
            k = moveHuman.number();
        } else {
            Player movePC = new PC();
            k = movePC.number();
        }

        boolean loop = true;
        for (int i = basicBoard.length - 1; i >= 0; i--) {
            if (loop == true) {
                for (int j = 0; j < basicBoard.length; j++) {
                    if (j == k) {
                        if (basicBoard[i][j] == 0) {
                            basicBoard[i][j] = 3;
                            loop = false;
                        }
                    }
                }
            }
        }
    }

    public void dropBlack() {
        modechoice modechoice = new modechoice();
        int k = 0;
        if ((modechoice.getMod1() == 1) || (modechoice.getMod1() == 3)) {
            Player moveHuman = new Human();
            k = moveHuman.number();
        } else {
            Player movePC = new PC();
            k = movePC.number();
        }
        boolean loop = true;
        for (int i = basicBoard.length - 1; i >= 0; i--) {
            if (loop == true) {
                for (int j = 0; j < basicBoard.length; j++) {
                    if (j == k) {
                        if (basicBoard[i][j] == 0) {
                            basicBoard[i][j] = 8;
                            loop = false;
                        }
                    }
                }
            }
        }
    }

    public int winnercheck() {
        for (int i = 0; i < basicBoard.length - 3; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                if ((basicBoard[i][j] != 0)
                        && (basicBoard[i + 1][j] != 0)
                        && (basicBoard[i + 2][j] != 0)
                        && (basicBoard[i + 3][j] != 0)
                        && ((basicBoard[i][j] == basicBoard[i + 1][j])
                        && (basicBoard[i + 1][j] == basicBoard[i + 2][j])
                        && (basicBoard[i + 2][j] == basicBoard[i + 3][j])))
                    return basicBoard[i][j];
            }
        }
        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length - 3; j++) {
                if ((basicBoard[i][j] != 0)
                        && (basicBoard[i][j + 1] != 0)
                        && (basicBoard[i][j + 2] != 0)
                        && (basicBoard[i][j + 3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i][j + 1])
                        && (basicBoard[i][j + 1] == basicBoard[i][j + 2])
                        && (basicBoard[i][j + 2] == basicBoard[i][j + 3])))
                    return basicBoard[i][j];
            }
        }

        for (int i = 0; i < basicBoard.length - 3; i++) {
            for (int j = 0; j < basicBoard.length - 3; j++) {
                if ((basicBoard[i][j] != 0)
                        && (basicBoard[i + 1][j + 1] != 0)
                        && (basicBoard[i + 2][j + 2] != 0)
                        && (basicBoard[i + 3][j + 3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i + 1][j + 1])
                        && (basicBoard[i + 1][j + 1] == basicBoard[i + 2][j + 2])
                        && (basicBoard[i + 2][j + 2] == basicBoard[i + 3][j + 3])))
                    return basicBoard[i][j];
            }
        }

        for (int i = 0; i < basicBoard.length - 3; i++) {
            for (int j = 3; j < basicBoard.length; j++) {
                if ((basicBoard[i][j] != 0)
                        && (basicBoard[i + 1][j - 1] != 0)
                        && (basicBoard[i + 2][j - 2] != 0)
                        && (basicBoard[i + 3][j - 3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i + 1][j - 1])
                        && (basicBoard[i + 1][j - 1] == basicBoard[i + 2][j - 2])
                        && (basicBoard[i + 2][j - 2] == basicBoard[i + 3][j - 3])))
                    return basicBoard[i][j];
            }
        }

        return 2;
    }
}
