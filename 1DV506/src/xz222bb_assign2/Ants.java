package xz222bb_assign2;

public class Ants {
    public static void main(String[] args) {
        double totalSteps = 0;

        for (int i = 0; i < 10; i++) {
            int[][] chessBoard = new int[8][8];
            int numberOfSteps = 0;
            int row = (int)(Math.random() * 7 + 1);
            int column = (int)(Math.random() * 7 + 1);
            int positionOfAnt = chessBoard[row][column];

            while (!check(chessBoard)) {
                int dice = (int)(Math.random() * 4 + 1);
                switch (dice) {
                    case 1:
                        row += 1;
                        if (row < 0 || row > 7) {
                            row -= 1;
                        }break;

                    case 2:
                        row -= 1;
                        if (row < 0 || row > 7) {
                            row += 1;
                        }break;

                    case 3:
                        column += 1;
                        if (column < 0 || column > 7) {
                            column -= 1;
                        }
                        break;

                    case 4:
                        column -= 1;
                        if (column < 0 || column > 7) {
                            column += 1;
                        }
                }
                numberOfSteps++;
                chessBoard[row][column] = 1;
            }
            totalSteps += numberOfSteps;
            System.out.println("Number of steps in simulation " + (i + 1) + ": " + numberOfSteps);
        }
        System.out.println("Average amount of steps: " + (totalSteps / 10));
    }

    public static boolean check(int[][] chessboard) {
        for (int row = 0; row < chessboard.length; row++) {
            for (int column = 0; column < chessboard[row].length; column++) {
                if (!(chessboard[row][column] == 1))
                    return false;
            }
        }
        return true;
    }
}




