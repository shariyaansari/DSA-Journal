// https://leetcode.com/problems/fibonacci-number/description/?envType=problem-list-v2&envId=recursion
package recursion;

public class Fibonacci {
    public static void fib(int n){
        int a = 0;
        int b = 1;
        int c = a+b;
        for(int i = 3; i<=n;i++){
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }
    public static int fibWithRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibWithRecursion(n-1) + fibWithRecursion(n-2);
        }
        
    }
    
    public static void main(String[] args) {
        // fib(8);
        System.out.println(fibWithRecursion(0));
    }
}
