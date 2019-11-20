import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean gameOver = false;
        String[] players = {"X", "O"};
        int x = 1;

        printBoard(board);

        while (!checkWin(board)) {
            if (x == 0) x=1;
            else x=0;
            move(board, players[x]);
        }

        System.out.println(players[x] + " wins!");
    }

    public static void printBoard(String[] board) {
        System.out.println();

        for (int i=1; i<=board.length; i++) {
            System.out.print(board[i-1] + " ");
            if (i%3 == 0 && i != 0) System.out.println();
        }

        System.out.println();
    }

    public static String[] move(String[] board, String player) {
        Scanner input = new Scanner(System.in);
        int move = 0;

        do {
            System.out.print(player + ": where do you want to go? (numbers 1-9) ");
            move = input.nextInt();
        } while (!checkEmpty(move-1, board));

        board[move-1] = player;

        printBoard(board);

        return board;
    }

    public static boolean checkEmpty(int i, String[] board) {
        if (board[i] != "X" && board[i] != "O") return true;
        return false;
    }

    public static boolean checkWin(String[] board) {
        if (board[0] == board [1] && board[1] == board[2]) return true;
        else if (board[3] == board [4] && board[4] == board[5]) return true;
        else if (board[6] == board [7] && board[7] == board[8]) return true;
        else if (board[0] == board [4] && board[4] == board[8]) return true;
        else if (board[2] == board [4] && board[4] == board[6]) return true;
        else if (board[0] == board [3] && board[3] == board[6]) return true;
        else if (board[1] == board [4] && board[4] == board[7]) return true;
        else if (board[2] == board [5] && board[5] == board[8]) return true;

        return false;
    }
}
