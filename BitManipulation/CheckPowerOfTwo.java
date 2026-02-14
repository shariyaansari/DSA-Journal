// https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=recursion
package BitManipulation;

public class CheckPowerOfTwo {
    public static boolean checkPower(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPower(10));
    }
}
