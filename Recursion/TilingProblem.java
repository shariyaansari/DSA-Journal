// https://www.geeksforgeeks.org/dsa/tiling-problem/
package recursion;

public class TilingProblem {
    // Not the best Time Complexity but good for basics 
    public static int numberOfWays(int n){
        // Base Cases 
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        // Vertical Choice 
        //       +
        // Horizontal Choice
        return numberOfWays(n-1) + numberOfWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(numberOfWays(3));
    }
}
