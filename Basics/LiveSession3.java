package Basics;

// Q. Reads the set of integer and prints the sum of odd and even 
// Q.2 factorial 
// Q.3 Power to 2 
// Q. Prime or not 

import java.util.Scanner;


public class LiveSession3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Q. Reads the set of integer and prints the sum of odd and even 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no of elements you want in an array: ");
        // int n = sc.nextInt();
        // int evenres = 0, oddres = 0;
        // for(int i = 1; i <= n; i++){
        //     System.out.println("Enter number for input: ");
        //     int number = sc.nextInt();
        //     if(number % 2 == 0){
        //         evenres += number;
        //     }
        //     else{
        //         oddres += number;
        //     }
        // }
        // System.out.println("Sum of even number = " + evenres);
        // System.out.println("Sum of Odd number = " + oddres);

        // Q.2 factorial 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no to get factorial: ");
        // int no = sc.nextInt();
        // int fact = 1;
        // if(no == 0){
        //     System.out.println(1);
        // }
        // else{
        //     for(int i = no; i > 0; i--){
        //         fact *= i;
        //     }
        //     System.out.println(fact);
        // }

        // Q.3 Power to 2 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the power of 2");
        // int power = sc.nextInt(); 
        // System.out.println("Enter base : ");
        // int base = sc.nextInt();
        // int res = 1;
        // for(int i = 1; i <= power; i++){
        //     res = res * base;
        //     System.out.println(res);
        // }

        // Prime No or not
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no to find if it's prime");
        // int no = sc.nextInt();
        // int factor = 0;
        // for (int i = 1; i <= no; i++){
        //     if(no % i == 0){
        //         factor++;
        //     }
        // }
        // if(no == 1){
        //     System.out.println("Neither prime nor co-prime");
        // }
        // else if(factor == 2){
        //     System.out.println("Prime Number");
        // }
        // else{
        //     System.out.println("Not a Prime number");
        // }

        // Second approach
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find if it's prime");
        int no = sc.nextInt();
        sc.close();
        boolean prime = true;
        // for (int i = 2; i <= no - 1 ; i++){
        //     if(no % i == 0){
        //         prime = false;
        //     }
        // }
        // More optimized
        for (int i = 2; i <= Math.sqrt(no) ; i++){
            if(no % i == 0){
                prime = false;
            }
        }
        if(no == 1){
            System.out.println("Neither prime nor co-prime");
        }
        else if(prime == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime number");
        }

    }
}
