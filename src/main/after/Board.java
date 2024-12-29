package main.after;


// Enum for Player Type
enum PlayerType {
    X, O
}

// Class to Represent the Board
class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }

    public boolean makeMove(int row, int col, PlayerType player) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            return false;
        }
        board[row][col] = player == PlayerType.X ? 'X' : 'O';
        return true;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
