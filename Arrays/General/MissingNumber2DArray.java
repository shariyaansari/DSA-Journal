package Arrays.General;

public class MissingNumber2DArray {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] oneDArray = new int[n*n];
        int index =0;
        for(int i = 0 ; i < n;i++){
            for(int j = 0; j < n;j++){
                oneDArray[index++] = grid[i][j];
            }
        }
        int lenghtOfOneD = oneDArray.length;
        int expectedSum = lenghtOfOneD*(lenghtOfOneD+1)/2;
        System.out.println(expectedSum);
        return oneDArray;
    }
    public static void main(String[] args) {
        int[][] grid= {{1,3}, {2,2}};
        findMissingAndRepeatedValues(grid);
    }
}
