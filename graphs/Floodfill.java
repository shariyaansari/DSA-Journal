// package graphs;

import java.util.*;

class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        int og = image[sr][sc]; 
        image[sr][sc] = color;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc});

        int[] drow = {-1, 0, 1, 0}; 
        int[] dcol = {0, 1, 0, -1}; 
        int n = image.length; 
        int m = image[0].length;
        while(!q.isEmpty()){
            int[] curr = q.remove(); 
            int row = curr[0]; 
            int col = curr[1]; 
            for(int i = 0; i < 4; i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == og){
                    q.add(new int[]{nrow, ncol}); 
                    image[nrow][ncol] = color;
                }
            }
        }
        return image;
    }
    public static void main(String[] args) {
        
    }
}
