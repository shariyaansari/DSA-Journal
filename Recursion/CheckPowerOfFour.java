// https://leetcode.com/problems/power-of-four/description/
package Recursion;

public class CheckPowerOfFour {
    public static boolean isPowerFour(int n){
        if(n == 1){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(n%4 != 0 && n > 0){
            return false;
        }
        else{
            return isPowerFour(n/4);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerFour(16));
    }
}
