package Basics;
// Live session 4 is in the pdf loopsandpatters.java
// Q. Return true for even and false for odd
// Q. Check if the given number is palindrome or not 
// Q. Sum of the digits
public class LiveSession5 {
    public static boolean isEven(int num){
        // if(num % 2 == 0){
        //     return true;
        // }
        // return false;
        return (num % 2 == 0);
    }

    // Method to check palindrome of a number
    public static boolean checkPalindrome(int n){
        int last_digit;
        int rev = 0;
        int num = n;
        while (n > 0){
            last_digit = n % 10;
            rev = (rev * 10) + last_digit;
            n /= 10; 
        }
        return (num == rev);
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        int last_digit;
        while (n != 0) {
            last_digit = n % 10;
            sum += last_digit;
            n /= 10;
        }
        return sum;
    }

    // public static boolean checkPalindrome(int n){
    //     if(n == reverse(n)){
    //         return true;
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        // System.out.println(isEven(9));
        // int num = 121;
        // System.out.println(checkPalindrome(num));
        System.out.println(sumOfDigits(234));
    }

}
