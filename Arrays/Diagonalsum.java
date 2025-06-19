// https://leetcode.com/problems/matrix-diagonal-sum/description/
package Arrays;

public class Diagonalsum {
    public static int sum(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum += matrix[i][j]; 
                }
                if(i+j == n-1 && i != j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumOptimized(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += matrix[i][i];
            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(sum(matrix));
    }
    
}
