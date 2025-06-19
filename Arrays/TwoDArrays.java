// BAsic of 2d arrays 
package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void Create2darray(){
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        // int n = matrix.length, m = matrix[0].length;
        System.out.println("ENter elements of 3x3 matrix: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // O/P
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Create2darray();
    }
}
