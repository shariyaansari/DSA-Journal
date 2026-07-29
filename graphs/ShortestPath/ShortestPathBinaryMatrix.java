
import java.util.*;

class ShortestPathBinaryMatrix {

    static class Pair {

        int row;
        int col;
        int wt;

        Pair(int row, int col, int wt) {
            this.row = row;
            this.col = col;
            this.wt = wt;
        }
    }

    public static int binaryMatrix(int[][] grid) {
        int n = grid.length;

        // edge case if the src or the last node is 1
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        // main code 
        int[][] distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        // mark top left cell as 0
        distance[0][0] = 0;

        // Initialize the queue 
        Queue<Pair> q = new LinkedList<>();

        // add source node to queue 
        q.add(new Pair(0, 0, 1));

        // delta row and column 
        int[] dr = {1, 0, -1, 0, 1, -1, 1, -1};
        int[] dc = {0, 1, 0, -1, 1, -1, -1, 1};
        int min = Integer.MAX_VALUE;

        boolean found = false;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.row;
            int col = p.col;
            int wt = p.wt;

            if (row == n - 1 && col == n - 1) {
                min = Math.min(min, wt);
                found = true;
            }

            // if n-1 row and col then update the minimum distance
            // check for all 8 directions 
            for (int i = 0; i < 8; i++) {
                int nrow = row + dr[i];
                int ncol = col + dc[i];
                int currDistance = wt + 1;

                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < n && grid[nrow][ncol] == 0
                        && currDistance < distance[nrow][ncol]) {
                    distance[nrow][ncol] = currDistance;
                    q.add(new Pair(nrow, ncol, currDistance));
                }
            }
        }

        if (!found) {
            return -1;
        }

        return min;

    }
}
