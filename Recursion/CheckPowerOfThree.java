package Recursion;

public class CheckPowerOfThree {
    public static boolean isPowerThree(int n){
        if(n == 1){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(n%3 != 0 && n > 0){
            return false;
        }
        else{
            return isPowerThree(n/3);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerThree(23446));
    }
}
