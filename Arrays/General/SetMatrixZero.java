package Arrays.General;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
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
    public static void setZeroes(int[][] matrix){
        List<List<Integer>> coordinates = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i =0; i < m;i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    List<Integer> rowcol = new ArrayList<>();
                    rowcol.add(i);
                    rowcol.add(j);
                    coordinates.add(rowcol);
                }
            }
        }
        for (List<Integer> list : coordinates) {
            int row = list.get(0);
            int col = list.get(1);
            setZeroeshelper(matrix, row, col);
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
