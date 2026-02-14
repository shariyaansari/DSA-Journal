// https://leetcode.com/problems/unique-paths/description/
package Backtracking;
// Souts are only written for my understanding
public class grid {
    public static int countWays(int row, int col, int n, int m){
    // base case 
        System.out.println("At the start row: "+ row + " col: "+ col);
        if(row == n-1 && col == m-1){
            System.out.println("hit the base case (return to prev)");
            System.out.println("------------------------------------");
            return 1;
        }
        // Edge case if i value goes out of the gorid or j value goes out of the grid
        else if(row == n || col == m ){
            System.out.println("Exceeded Boundry (return to prev)");
            System.out.println("------------------------------------");
            return 0;
        }
        
        System.out.println("Entering through down |row: "+ row + " col: "+ col);
        int w2 = countWays(row, col+1, n, m);
        System.out.println("Entereing through right-> row: "+ row + " col: "+ col);
        int w1 = countWays(row+1, col, n, m);
        return w1+w2;
    }

    // Another way of calculating is to calculate the permutations of the all directions for ex n = 3 ---- so it can only go 2 rights and 2 downs so {D,D}{R,R} 
    // So we can use the direct formula for permudation 
    public static long fact(int num){
        long res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res; 
    }
    public static int uniquePaths(int m, int n) {
        long ways = fact(m+n-2) / (fact(m-1) * fact(n-1));
        return (int)ways; 
    }
    public static void main(String[] args) {
        int n = 3; 
        int m = 3;
        
        System.out.println(countWays(0, 0, n, m));
    }
}
