// Check for a valid sudoku
// https://leetcode.com/problems/valid-sudoku/description/
package Backtracking;

public class Sudoku {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        // Check if column contains the duplicate 
        for(int i = 0; i < 9;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        // Check for row
        for(int j = 0; j < 9;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // For the grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr; i < sr+3;i++){
            for(int j = sc; j < sc+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean validSudoku(int[][] sudoku, int row, int col){
        // Base case
        if(row == 9){
            return true;
        }
        // Kaam 
        // Assign values to row
        int nextrow = row;
        int nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        // Condition for when my sudoku alr has value other than 0;
        if(sudoku[row][col] != 0){
            // Directly call for next level 
            return validSudoku(sudoku, nextrow, nextcol);
        }

        // Till the value of my digit is 9 i have to try placing my values
        for(int digit = 1 ; digit <= 9; digit++){
            // Make a safe fiunction which checks whether it's safe to placee the digit or not 
             if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                // Recursion 
                // If this returns true then solution exists
                if(validSudoku(sudoku, nextrow, nextcol)){
                    return true;
                }else{
                    // If the above function doesn't return true then I will let my digit be 0;
                    sudoku[row][col] = 0;
                }
             }
        }
        return false;
    }
    public static void printSudoku(int[][] sudoku){
        for(int i = 0; i <9;i++){
            for(int j =0; j <9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                          {4,9,0,1,5,7,0,0,2},
                          {0,0,3,0,0,4,1,9,0},
                          {1,8,5,0,6,0,0,2,0},
                          {0,0,0,0,2,0,0,6,0},
                          {9,6,0,4,0,5,3,0,0},
                          {0,3,0,0,7,2,0,0,4},
                          {0,4,9,0,3,0,0,5,7},
                          {8,2,7,0,0,9,0,1,3},
                        };
        // System.out.println(validSudoku(sudoku, 0, 0));
        if(validSudoku(sudoku, 0, 0)){
            System.out.println("soln Exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Soln doen't exist");
        }
    }
}
