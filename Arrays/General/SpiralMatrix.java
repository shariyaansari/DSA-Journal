// https://leetcode.com/problems/spiral-matrix/description/
package Arrays.General;

public class SpiralMatrix {
    public static void Spiral(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;
        int startrow = 0;
        int endrow = n-1;
        int startCol = 0;
        int endcol = m-1;
        
        while(startrow<=endrow && startCol <= endcol){
            // top
            for (int j = startCol; j <= endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
            }
            // Right
            for(int i = startrow+1; i <= endrow; i++){
                System.out.print(matrix[i][endcol]+ " ");
            }
            // bottom
            for(int j = endcol-1; j >=startCol; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            // left
            for(int i = endrow-1; i >= startrow+1; i--){
                if(startCol == endcol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startrow++;
            endrow--;
            startCol++;
            endcol--;

        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        Spiral(matrix);
    }
}
