package Patterns;
// Q.Print 1 to n sum using while loop
// Q.Basic square pattern 
// Q.Reverse of a number
// Q.break on the multiple of 10
// Q.Some easy patterns 

import java.util.Scanner; 

public class loopsAndPatterns {
    public static void main(String[] args) {
        
        // Print 1 to n sum using while loop
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number for getting sum");
        // int range = sc.nextInt();
        // int Sum = 0;
        // int i = 1;
        // while ( i <= range){
        //     Sum += i;
        //     i++;
        // }
        // System.out.println(Sum);

        // Q. Basic square pattern 
        // for(int i = 1; i <= 4; i++){
        //     System.out.println("* * * *");
        // }

        // Reverse of a number 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number to get the reverse: ");
        // int number = sc.nextInt();
        // int rem = 1;
        // int reverse = 0; 
        // while(number > 0){
        //     rem = number % 10;
        //     reverse = (reverse * 10) + rem;
        //     number /= 10;
        //     System.out.print(rem);
        // }

        // Q.break on the multiple of 10
        // while(true){
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the number");
        //     int num = sc.nextInt();
        //     if(num % 10 == 0){
        //         // break;
        //         continue;
        //     }
        // }
        // System.out.println("Broke out of the loop");

        // Print Patterns
        // 1. 
        // ****
        // ****
        // ****
        // ****
        // int n = 5;
        // int m = 4;
        // int count = 1;
        // for(int i = 1; i <= n; i++){
        //     // System.out.print("*");
        //     for(int j = 1; j <= m; j++){
        //         System.out.print(count++ + "\t");
        //     }
        //     System.out.println();
        // }

        // 2.
        // ****
        // *  *
        // *  *
        // ****
        // for(int i = 1; i <= n; i++){
        //     // System.out.print("*");
        //     for(int j = 1; j <= m; j++){
        //         if(i == 1 || i == n || j == 1 || j == m)
        //         {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 3.
        // *
        // **
        // ***
        // ****
        // for(int i = 1; i <= n; i++){
        //     // System.out.print("*");
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 4.Inverted stars
        // int n = 5; 
        // for(int i = 1; i <= n; i++){
        //     // System.out.print("*");
        //     // for(int j = n; j >= i; j--){
        //     for(int j = 1; j <= (n-i+1); j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // OR 

        // for(int i = n; i >= 1; i--){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        
        // Print Character Pattern 
        
        int n = 4;
        char ch = 'A';
        for(int i = 1; i<= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println("");
        }

    }
}
