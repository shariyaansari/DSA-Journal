// https://www.geeksforgeeks.org/dsa/longest-possible-route-in-a-matrix-with-hurdles/

package Backtracking;

public class LongestPossibleRoute {
    static int maxPath = 0;
    public static void route(int[][] route, boolean[][] visited, int row, int col,int dist){

        // Edge Cases
        // row and col out of bounds and if visited is alr true 
        if (row < 0 || col < 0 || row >= route.length || col >= route[0].length ||
            route[row][col] == 0 || visited[row][col]) {
            return;
        }

        // Updating max path here
        maxPath = Math.max(maxPath, dist);
        
        System.out.println("Maxpath Updated"+ maxPath);

        visited[row][col] = true;
        System.out.println("marked visited "+ visited[row][col]);
        // 4 directions
        // Up
        System.out.println("Moved UP");
        route(route, visited, row-1, col,dist+1);
        // down
        System.out.println("Moved down");
        route(route, visited, row+1, col, dist+1);
        // left
        System.out.println("Moved left");
        route(route, visited, row, col-1, dist+1);
        // right
        System.out.println("Moved right");
        route(route, visited, row, col+1, dist+1);
        visited[row][col] = false;
    }
    public static void main(String[] args) {
        int[][] route ={
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        boolean[][] visited = new boolean[route.length][route[0].length];
        route(route, visited,0,0,0);
        System.out.println(maxPath);
    }
}
