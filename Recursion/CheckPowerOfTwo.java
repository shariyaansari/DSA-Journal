// https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=recursion
package recursion;

public class CheckPowerOfTwo{
    public static boolean isPower(int n){
        if(n == 1){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(n%2 != 0 && n > 0){
            return false;
        }
        else{
            return isPower(n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPower(16));
    }
}