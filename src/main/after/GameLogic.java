package main.after;
import java.util.Scanner;

// Class to Handle Game Logic
class GameLogic {
    private Board board;
    private Player currentPlayer;
    private boolean gameWon;

    public GameLogic() {
        board = new Board();
        currentPlayer = new Player(PlayerType.X);
        gameWon = false;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (!gameWon) {
            board.printBoard();
            makeMove(scanner);
            checkForWin();
            if (!gameWon && board.isFull()) {
                System.out.println("It's a draw!");
                return;
            }
            switchPlayer();
        }
        board.printBoard();
        System.out.println("Player " + currentPlayer.getType() + " wins!");
    }

    private void makeMove(Scanner scanner) {
        int row, col;
        boolean validMove;
        do {
            System.out.print("Player " + currentPlayer.getType() + ", enter your row (0, 1, 2) and column (0, 1, 2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            validMove = board.makeMove(row, col, currentPlayer.getType());
            if (!validMove) {
                System.out.println("Invalid move. Try again.");
            }
        } while (!validMove);
    }

    private void checkForWin() {
        char playerSymbol = currentPlayer.getType() == PlayerType.X ? 'X' : 'O';
        if (checkRows(playerSymbol) || checkColumns(playerSymbol) || checkDiagonals(playerSymbol)) {
            gameWon = true;
        }
    }

    private boolean checkRows(char playerSymbol) {
        for (int row = 0; row < 3; row++) {
            if (board.getCell(row, 0) == playerSymbol && board.getCell(row, 1) == playerSymbol && board.getCell(row, 2) == playerSymbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns(char playerSymbol) {
        for (int col = 0; col < 3; col++) {
            if (board.getCell(0, col) == playerSymbol && board.getCell(1, col) == playerSymbol && board.getCell(2, col) == playerSymbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(char playerSymbol) {
        return (board.getCell(0, 0) == playerSymbol && board.getCell(1, 1) == playerSymbol && board.getCell(2, 2) == playerSymbol)
                || (board.getCell(0, 2) == playerSymbol && board.getCell(1, 1) == playerSymbol && board.getCell(2, 0) == playerSymbol);
    }

    private void switchPlayer() {
        currentPlayer = new Player(currentPlayer.getType() == PlayerType.X ? PlayerType.O : PlayerType.X);
    }
}
