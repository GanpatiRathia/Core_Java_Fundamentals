package _05_Array;

public class _05_2DArray {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        // Initialize chessboard with pieces
        board[0][0] = 'R'; // Rook
        board[0][1] = 'N'; // Knight
        board[0][2] = 'B'; // Bishop
        board[0][3] = 'Q'; // Queen
        board[0][4] = 'K'; // King
        board[0][5] = 'B';
        board[0][6] = 'N';
        board[0][7] = 'R';

        // Display the chessboard
        for (char[] row : board) {
            for (char piece : row) {
                System.out.print((piece == '\u0000' ? '.' : piece) + " ");
            }
            System.out.println();
        }
    }
}
