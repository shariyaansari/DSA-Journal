package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatAMaze {
    public static void maze(int[][] maze,int i, int j, boolean[][] visited, String path,List<String> ans){
        int n = maze.length;
        // Base case When the rat reaches the final destination it adds the path and return to the function
        if(i == n-1 && j == n-1){
            ans.add(path);
            System.out.println(path);
            return;
        }
        //Check boundries and mark visited
        if(i < 0|| i >= n || j < 0|| j >= n || maze[i][j] == 0 || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        
        // Check in all the directions 
        // SO I will Call out on all possibilities and add it to my path and when I reach to n-1 it will automatically give me the path 
        maze(maze, i+1,j,visited, path+'D', ans);
        maze(maze, i,j+1,visited, path+'R', ans);
        maze(maze, i-1,j,visited, path+'L', ans);
        maze(maze, i,j-1,visited, path+'U', ans);

        visited[i][j] = false;

    }
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        maze(maze, 0, 0, visited, "", new ArrayList<String>());
    }
}
