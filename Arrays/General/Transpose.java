package Arrays.General;

public class Transpose {
    public static void transpose(int[][] matrix) {
        // rows
        int m = matrix.length;
        // No of columns
        int n = matrix[0].length;
        System.out.println(m +" "+ n);
        // Make a transpose matrix'
        int[][] transposemat = new int[n][m];
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n ;j++){
                transposemat[j][i] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < transposemat.length; i++){
            for(int j = 1 ; j < transposemat[0].length;j++){
                System.out.print(transposemat[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        transpose(matrix); 
    }
}
