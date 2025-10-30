import java.util.Scanner;

public class Tac {
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playGame() {
        boolean xTurn = true;
        Scanner scanner = new Scanner(System.in); // Create Scanner here to close it later
        while (true) {
            if (xTurn) {
                System.out.println("X's turn");
            } else {
                System.out.println("O's turn");
            }
            int row = getValidNumber(scanner, "Enter row: ");
            int col = getValidNumber(scanner, "Enter column: ");
            if (board[row][col] != '-') {
                System.out.println("Invalid move, try again.");
                continue;
            }
            if (xTurn) {
                board[row][col] = 'X';
            } else {
                board[row][col] = 'O';
            }
            printBoard();
            if (checkForWin(xTurn)) {
                if (xTurn) {
                    System.out.println("X wins!");
                } else {
                    System.out.println("O wins!");
                }
                break;
            }
            xTurn = !xTurn;
        }
        scanner.close(); // Close the Scanner to prevent resource leaks
    }

    private static int getValidNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 0 && num < 3) {
                    return num;
                }
            } else {
                scanner.next(); // Consume invalid input
            }
            System.out.println("Invalid input, try again.");
        }
    }

    private static boolean checkForWin(boolean xTurn) {
        char player = xTurn ? 'X' : 'O';
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}