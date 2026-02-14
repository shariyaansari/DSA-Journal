package Arrays.General;

public class RotateMatrix {
    public static void reverseRow(int[] arr){
        int left = 0; 
        int right = arr.length-1;
        while(right < arr.length && left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotate90(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[][] trans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                trans[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < m; i++){
            reverseRow(trans[i]);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(trans[j][i]);
            }
            System.out.println();
        }
        

    }
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};
        int matrix[][] = {{0,1},
                          {1,0}};
        rotate90(matrix);
    }
}
