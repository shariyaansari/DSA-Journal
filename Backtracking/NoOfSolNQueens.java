package Backtracking;

public class NoOfSolNQueens {
    // Since recursion have lots of levels so therefore each time count value will reset....to avoid that we make count as static variable
    static int count =0;
    public static void noofSoln(char[][] board, int row){
        if(row == board.length){
            count++;
            return;
        }
        for(int j = 0; j < board.length;j++){
            if(isSafe(board, row, j) == true){
                board[row][j] = 'Q';
                // recursive call
                noofSoln(board, row+1);
                // backtrack 
                board[row][j] = 'x';
            }
        }            
    }
    public static boolean isSafe(char[][] board, int row,int col){
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
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize all the positions of board 
        for(int i = 0; i < n;i++){
            for(int j= 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        noofSoln(board, 0);
        System.out.println(count);
    }
}
