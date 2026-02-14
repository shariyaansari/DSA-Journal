// https://leetcode.com/problems/powx-n/description/?envType=problem-list-v2&envId=recursion
package Recursion;

public class XPowerN {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    // O(n)
    public static int myPow(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int halfPower = optimizedPow(x, n/2) * optimizedPow(x, n/2);
        if(n % 2 != 0){
            halfPower = x * halfPower;
        }
        return halfPower;

    }

    // The answer is calculating faster internally with a time complexity of O(log n)
    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        int halfPower = optimizedPow(x, n/2);
        int halfPowerSquared = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowerSquared = x * halfPowerSquared;
        }
        return halfPowerSquared;

    }
    public static void main(String[] args) {
        // System.out.println(power(3,2));
        System.out.println(optimizedPow(2, 7));
    }
}
 