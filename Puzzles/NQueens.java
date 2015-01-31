/*
 * N-Queens Problem
 */

public class NQueens {

    public void solve(int N, int[][] board, int i, int j, boolean found) {

        //if found we return the result
        if (!found) {
            //check if the current position is valid
            if (IsValid(board, i, j)) {
                board[i][j] = 1;
                //Uncomment to track the partial results
                //System.out.println("[+]New Queen added at (" + i + "," + j + ")");
                //PrintBoard(board);

                //check if this was the last queen
                if (i == N - 1) {
                    found = true;
                    PrintBoard(board);
                }
                //call the next iteration
                solve(N, board, i + 1, 0, found);
            } else {
                //if the position is not valid
                //if it was the last row we do backtracking
                while (j >= N - 1) {
                    int[] a = BackTracking(board, i, j);
                    i = a[0];
                    j = a[1];
                    //Uncomment to track the partial results
                    //System.out.println("[+]Rolled back at (" + i + "," + j + ")");
                    //PrintBoard(board);
                }
                //we do the next call
                solve(N, board, i, j + 1, false);
            }
        }
    }

    public int[] BackTracking(int[][] board, int i, int j) {
        int[] a = new int[2];
        for (int x = i; x >= 0; x--) {
            for (int y = j; y >= 0; y--) {
                //seeks the last queen
                if (board[x][y] != 0) {
                    //deletes the last queen and returns the position
                    board[x][y] = 0;
                    a[0] = x;
                    a[1] = y;
                    return a;
                }
            }
        }
        return a;
    }

    public boolean IsValid(int[][] board, int i, int j) {

        int x;
        //check if there is any queen in the same column
        for (x = 0; x < board.length; x++) {
            if (board[i][x] != 0) {
                return false;
            }
        }
        //check if there is any queen in the same row
        for (x = 0; x < board.length; x++) {
            if (board[x][j] != 0) {
                return false;
            }
        }
        //check if there is any queen in the diagonals
        if (!IsSafeDiag(board, i, j)) {
            return false;
        }
        return true;
    }

    public boolean IsSafeDiag(int[][] board, int i, int j) {

        int ii = i;
        int jj = j;
        while (jj >= 0 && ii >= 0 && ii < board.length && jj < board.length) {
            if (board[ii][jj] != 0) {
                return false;
            }
            jj++;
            ii++;
        }
        ii = i;
        jj = j;
        while (jj >= 0 && ii >= 0 && ii < board.length && jj < board.length) {
            if (board[ii][jj] != 0) {
                return false;
            }
            jj--;
            ii--;
        }
        ii = i;
        jj = j;
        while (jj >= 0 && ii >= 0 && ii < board.length && jj < board.length) {
            if (board[ii][jj] != 0) {
                return false;
            }
            jj--;
            ii++;
        }
        ii = i;
        jj = j;
        while (jj >= 0 && ii >= 0 && ii < board.length && jj < board.length) {
            if (board[ii][jj] != 0) {
                return false;
            }
            jj++;
            ii--;
        }
        return true;
    }

    public void PrintBoard(int[][] board) {
        System.out.print(" ");
        for (int j = 0; j < board.length; j++) {
            System.out.print(j);
        }
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i);
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("Q");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        //we parse the input, which is the size of the problem
        int N = Integer.parseInt(args[0]);

        //we create a board
        int[][] board = new int[N][N];

        //we create an instance of the class
        NQueens obj = new NQueens();

        //we call the method that solves the problem
        obj.solve(N, board, 0, 0, false);
    }
}
