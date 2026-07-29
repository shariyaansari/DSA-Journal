import java.util.LinkedList;
import java.util.Queue;

public class SurroundeRegions {
    public static void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length; 
        Queue<int[]> q = new LinkedList<>();
        // Add boundry zeroes to the queue 
        // top
        for(int i = 0; i < m; i++){
            if(board[0][i] == 'O'){
                board[0][i] = 'S';
                q.add(new int[]{0, i});
            }
        }
        // bottom
        for(int i = 0; i < m; i++){
            if(board[n-1][i] == 'O'){
                board[n-1][i] = 'S';
                q.add(new int[]{n-1, i});
            }
        }
        // left
        for(int i = 1; i < n; i++){
            if(board[i][0] == 'O'){
                board[i][0] = 'S';
                q.add(new int[]{i, 0});
            }
        }
        // right
        for(int i = 1; i < n; i++){
            if(board[i][m-1] == 'O'){
                board[i][m-1] = 'S';
                q.add(new int[]{i, m-1});
            }
        }
        int[] drow = {-1, 0, 1, 0}; 
        int[] dcol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int[] curr = q.remove(); 
            int row = curr[0]; 
            int col = curr[1];
            for(int i = 0; i < 4; i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow > 0 && nrow < n-1 && ncol > 0 && ncol < m-1 && board[nrow][ncol] == 'O'){   
                    board[nrow][ncol] = 'S';
                    q.add(new int[]{nrow, ncol});
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'S'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';    
                }
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
