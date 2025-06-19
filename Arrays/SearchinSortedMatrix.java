
// https://leetcode.com/problems/search-a-2d-matrix/
package Arrays;

public class SearchinSortedMatrix {
    public static boolean search(int[][] matrix,int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at: ("+row+" "+","+col+")");
                return true;
            } 
            else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static boolean searchapproach2(int[][] matrix,int key) {
        int row = matrix.length-1;
        int col = 0;
        while(col < matrix.length && row >= 0){
            
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}}; 
        int key = 333;
        search(matrix,key); 
                          
    }
}
