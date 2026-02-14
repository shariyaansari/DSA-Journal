package Backtracking;

public class PrintOneSolNQueen {
    public static boolean soln(char[][] board, int row){
        // base case is when rows hit board.length
        if(row == board.length){
            return true;
        }

        // Without considering the possibility of attack just place the queens 
        // // All possible soln to place queen 
        // for(int j = 0; j < board.length;j++){
        //     board[i][j] = 'Q';
        //     // then I will recursively call for next row 
        //     soln(board, i+1);
        //     // So to remove the queen to make space for another queen 
        //     // set board[][] back to '.'
        //     board[i][j] = 'x';
        // }

        // For a queen to sit on the safe place
        // Make a isSafe Function 

        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(soln(board, row+1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row,int col){
        // We have to check whether it's safe to place the queen Vertically up, diagonally left up and right up 
        // No need to check down as no queens are there 
        // For vertically up
        for(int i = row -1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up 
        for(int i = row -1,j = col -1; i >= 0 && j >=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1, j = col + 1; i >= 0 && j < board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

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
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize all the positions of board 
        for(int i = 0; i < n;i++){
            for(int j= 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        if(soln(board, 0)){
            printBoard(board);
        }
        else{
            System.out.println("Soln not possible");
        }
    }
}
