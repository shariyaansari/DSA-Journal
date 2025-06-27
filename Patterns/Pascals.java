// https://leetcode.com/problems/pascals-triangle/description/
package Patterns;

import java.util.ArrayList;
import java.util.List;

public class Pascals {

    // Using List
    public static List<List<Integer>> pattern(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i;j++){
                // Printing 1
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
             triangle.add(row);
        }
        return triangle;
    }
    // Using Array
    public static void patternWithArray(int n){
        int[][] arr = new int[n][n];
        for(int i = 0; i < n ;i++){
            // for(int k = 0; k < n-i-1; k++){
            //     System.out.print("  ");
            // }
            for(int j = 0; j <= i;j++){
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]+"  ");
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j]+"  ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // pattern(6);
        // System.out.println(pattern(6));
        patternWithArray(6);
    }
}
