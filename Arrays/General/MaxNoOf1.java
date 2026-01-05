// https://leetcode.com/problems/row-with-maximum-ones/
package Arrays.General;

public class MaxNoOf1 {
    // for sorted array
    // Need a bs function to find the starting pos of 1 
    public static int bs(int[] mat){
        int start = 0; 
        int end = mat.length; 
        int pos1 = 0;
        if(mat[0] == 0 && mat[mat.length-1] == 0) return 0;
        while( start <= end){
            int mid = (start+end)/2;
            if(mat[mid] == 1){
                pos1 = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        int count = mat.length-pos1;
        return count;
    }
    public static int[] rowAndMaximumOnesSorted(int[][] mat) {
        int count;
        int maxcount = 0; 
        int[] max = new int[2];
        for(int i = 0; i < mat.length; i++){
            count = bs(mat[i]);
            if(count > maxcount){
                maxcount = count;
                max[0] = i; 
                max[1] = count;
            }
        }
        System.out.println(max[0] + ", " +max[1]);
        return max;
    }

    // Unsorted array
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] max = new int[2];
        int maxcount = 0;
        for(int i = 0; i < mat.length; i++){
            int count = 0;    
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > maxcount && count != maxcount){
                max[0] = i;
                max[1] = count;
                maxcount = count; 
            }
        }
        System.out.println(max[0] + ", " +max[1]);
        return max;
    }
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};  
        int[][] mat2 = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};  
        rowAndMaximumOnes(mat);
        System.out.println("---");
        rowAndMaximumOnesSorted(mat2);
        
    }
}
