// https://leetcode.com/problems/set-matrix-zeroes/
package Arrays.General;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    // Brute Force
    public static void setZeroeshelper(int[][] matrix, int row, int col){
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(i == row || j == col){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static void setZeroesapproach1(int[][] matrix){
        // For storing the index of [row,col] in the list coordinates 
        List<List<Integer>> coordinates = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i =0; i < m;i++){
            for(int j = 0; j < n; j++){
                // Go through all elements and check if the element is 0 and if it is zero then append it to the coordinates 
                if(matrix[i][j] == 0){
                    List<Integer> rowcol = new ArrayList<>();
                    rowcol.add(i);
                    rowcol.add(j);
                    coordinates.add(rowcol);
                }
            }
        }
        // Go for each coordinate which has [row, col] value stored and make all the associated rows and colums 0 with the help of the helper function 
        for (List<Integer> list : coordinates) {
            int row = list.get(0);
            int col = list.get(1);
            setZeroeshelper(matrix, row, col);
        }

    }

    // =========================================================
    // this is based on marker technique
    public static void setZeroesapproach2(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        // Checking if 0 exists in first row
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    firstRow = true;
                }
            }
        }
        
        // Checking if 0 exists in first Col
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < 1;j++){
                if(matrix[i][j] == 0){
                    firstCol = true;
                }
            }
        }

        // Next loop for the rest except the first row and col 
        // Setting markers on which the row and col that has to become 0 later 
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Applying zeroes based on marker 
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow){
            for (int j = 0; j < matrix[0].length; j++) matrix[0][j] = 0;
        }
        if(firstCol){
            for (int j = 0; j < matrix.length; j++) matrix[j][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroesapproach2(matrix);
    }
}
