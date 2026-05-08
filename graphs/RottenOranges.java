// https://leetcode.com/problems/rotting-oranges/
package graphs;

import java.util.*;

public class RottenOranges {
    static class Pair {
        int row;
        int col;
        int t;

        Pair(int r, int c, int t) {
            this.row = r;
            this.col = c;
            this.t = t;
        }
    }

    public static int Oranges(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        int cntFresh = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }

                if (grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }
        int[] drow = {-1, 0, +1, 0}; 
        int[] dcol = { 0, 1, 0, -1 };
        int cnt = 0;
        int tm = 0;
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().t;
            tm = Math.max(tm, t);
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && visited[nrow][ncol] == 0
                        && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, t + 1));
                    visited[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if (cnt != cntFresh) {
            return -1;
        }
        return tm;
    }
}
