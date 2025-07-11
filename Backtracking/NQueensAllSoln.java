// All solutions
package Backtracking;

public class NQueensAllSoln {
    public static void soln(char[][] board, int i){
        // base case is when rows hit board.length
        if(i == board.length){
            printBoard(board);
            return;
        }

        // Without considering the possibility of attack just place the queens 
        // All possible soln to place queen 
        for(int j = 0; j < board.length;j++){
            board[i][j] = 'Q';
            // then I will recursively call for next row 
            soln(board, i+1);
            // So to remove the queen to make space for another queen 
            // set board[][] back to '.'
            board[i][j] = 'x';
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("---------------CHESS BOARD--------------");
        for(int i = 0; i < board.length;i++){
            for(int j= 0; j < board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];

        // Initialize all the positions of board 
        for(int i = 0; i < n;i++){
            for(int j= 0; j < n; j++){
                board[i][j] = 'x';
            }
        }

        // Call soln for n queens and n rows 
        soln(board, 0);
    }
}
