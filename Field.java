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
        Player moveHuman = new Human();
        int k = moveHuman.number();
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
        Player moveHuman = new Human();
        int k = moveHuman.number();
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

    public boolean winnercheck() {
        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                if ((basicBoard[i][j] != 0)
                        && (basicBoard[i + 1][j] != 0)
                        && (basicBoard[i + 2][j] != 0)
                        && (basicBoard[i + 3][j] != 0)
                        && ((basicBoard[i][j] == basicBoard[i + 1][j])
                        && (basicBoard[i + 1][j] == basicBoard[i + 2][j])
                        && (basicBoard[i + 2][j] == basicBoard[i + 3][j])))
                    return false;
            }
        }
        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                if((basicBoard[i][j] != 0)
                        && (basicBoard[i][j+1] !=0)
                        && (basicBoard[i][j+2] != 0)
                        && (basicBoard[i][j+3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i][j+1])
                        && (basicBoard[i][j+1] == basicBoard[i][j+2])
                        && (basicBoard[i][j+2] == basicBoard[i][j+3])))
                    return false;
            }
        }

        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                if((basicBoard[i][j] != 0)
                        && (basicBoard[i+1][j+1] != 0)
                        && (basicBoard[i+2][j+2] != 0)
                        && (basicBoard[i+3][j+3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i+1][j+1])
                        && (basicBoard[i+1][j+1] == basicBoard[i+2][j+2])
                        && (basicBoard[i+2][j+2] == basicBoard[i+3][j+3])))
                    return false;
            }
        }

        for (int i = 0; i < basicBoard.length; i++) {
            for (int j = 0; j < basicBoard.length; j++) {
                if((basicBoard[i][j] != 0)
                        && (basicBoard[i+1][j-1] != 0)
                        && (basicBoard[i+2][j-2] != 0)
                        && (basicBoard[i+3][j-3] != 0)
                        && ((basicBoard[i][j] == basicBoard[i+1][j-1])
                        && (basicBoard[i+1][j-1] == basicBoard[i+2][j-2])
                        && (basicBoard[i+2][j-2] == basicBoard[i+3][j-3])))
                    return false;
            }
        }
        return true;
    }
}
