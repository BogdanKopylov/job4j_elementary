package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            boolean isX = board[i][i] == 'X';
            if (isX && (monoVertical(board, i) || monoHorizontal(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
