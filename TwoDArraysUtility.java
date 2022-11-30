public class TwoDArraysUtility {
    public boolean play(int player, int column, int[][] board) { //Done!
        for (int row = 5; row >= 0; row--) {
            if (board[row][column - 1] == 0) {
                board[row][column - 1] = player;
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }

    public int checkForWin(int[][] board) {
        //horizontal win
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if ((board[i][j] == 1) && (board[i][j + 1] == 1) && (board[i][j + 2] == 1) && (board[i][j + 3] == 1)) {
                    return 1;
                }
                else if ((board[i][j] == 2) && (board[i][j + 1] == 2) && (board[i][j + 2] == 2) && (board[i][j + 3] == 2)) {
                    return 2;
                }
                else {
                    continue;
                }
            }
        }

        //vertical win
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((board[i][j] == 1) && (board[i + 1][j] == 1) && (board[i + 2][j] == 1) && (board[i + 3][j] == 1)) {
                    return 1;
                }
                else if ((board[i][j] == 2) && (board[i + 1][j] == 2) && (board[i + 2][j] == 2) && (board[i + 3][j] == 2)) {
                    return 2;
                }
                else {
                    continue;
                }
            }
        }

        //TODO: ascending diagonal win
        for (int i = 3; i < board.length; i++) {
            for (int j = 3; j < board[i].length; j++) {
                if ((board[i][j] == 1) && (board[i - 1][j + 1] == 1) && (board[i - 2][j + 2] == 1) && (board[i - 3][j + 3] == 1)) {
                    return 1;
                }
                else if ((board[i][j] == 2) && (board[i - 1][j + 1] == 2) && (board[i - 2][j + 2] == 2) && (board[i - 3][j + 3] == 2)) {
                    return 2;
                }
                else {
                    continue;
                }
            }
        }
        //TODO: descending diagonal win
        for (int i = 3; i < board.length; i++) {
            for (int j = 3; j < board[i].length; j++) {
                if ((board[i][j] == 1) && (board[i - 1][j - 1] == 1) && (board[i - 2][j - 2] == 1) && (board[i - 3][j - 3] == 1)) {
                    return 1;
                }
                else if ((board[i][j] == 2) && (board[i - 1][j - 1] == 2) && (board[i - 2][j - 2] == 2) && (board[i - 3][j - 3] == 2)) {
                    return 2;
                }
                else {
                    continue;
                }
            }
        }
        return 0;
    }
}
