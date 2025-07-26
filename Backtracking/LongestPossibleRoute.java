// https://www.geeksforgeeks.org/dsa/longest-possible-route-in-a-matrix-with-hurdles/
package Backtracking;

public class LongestPossibleRoute {
    static int maxPath = 0;
    public static void route(int[][] route, boolean[][] visited, int row, int col, int destRow, int destCol, int dist){
        
        if (row < 0 || col < 0 || row >= route.length || col >= route[0].length ||
            route[row][col] == 0 || visited[row][col]) {
            return;
        }

        if (row == destRow && col == destCol) {
            maxPath = Math.max(maxPath, dist);
        }
        visited[row][col] = true;
        // Kaam 
        // 4 directions
        // Up
        route(route, visited, row-1, col, destRow, destCol, dist+1);
        // down
        route(route, visited, row+1, col, destRow, destCol, dist+1);
        // left
        route(route, visited, row, col-1, destRow, destCol, dist+1);
        // right
        route(route, visited, row, col+1, destRow, destCol, dist+1);
        visited[row][col] = false;
    }
    public static void main(String[] args) {
        int[][] route ={
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        boolean[][] visited = new boolean[route.length][route[0].length];
        route(route, visited,0,0,2,2,0);
        System.out.println(maxPath);
    }
}
