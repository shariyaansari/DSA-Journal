
// https://leetcode.com/problems/search-a-2d-matrix/
package Arrays;

public class SearchinSortedMatrix {
    public static boolean searchNaive(int[][] matrix,int key) {
        // Comparing with all the elements 
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean searchBinary(int[] matrix,int key) {
        // Comparing with all the elements 
        int start = 0;
        int end = matrix.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(matrix[mid] == key){
                return true;
            } 
            else if(key > matrix[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return false;
    }
    public static boolean BSHelper(int[][] matrix, int key){
        int n = matrix.length;
        for(int i = 0; i < n;i++){
            if(searchBinary(matrix[i], key)){
                return true;
            }
        }
        return false;
    }
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
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}}; 
        int key = 33;
        search(matrix,key); 
        System.out.println(searchNaive(matrix, key));
        
                          
    }
}
