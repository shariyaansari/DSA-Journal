// import graphs;
import java.util.*;

public class DistanceOfNearest0 {
    static class Pair {
        int row;
        int col;
        int step;

        Pair(int row, int col, int step) {
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] visited = new int[n][m];
        int[][] dist = new int[n][m];

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 1;
                } else {
                    visited[i][j] = 0;
                }
            }
        }

        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            int steps = q.peek().step;
            q.remove();
            dist[row][col] = steps;

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0) {
                    visited[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol, steps + 1));
                }
            }

        }
        return dist;
    }
    
    public static void main(String[] args) {
        int[][] mat = {
                    {0,0,0},
                    {0,1,0},
                    {0,0,0}
        };

    }    
}
