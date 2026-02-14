package Basics;
// Q.find Binomial Coefficient 
// Q method Overloading
// Q.Prime Number
// Q.Convert Binary to decimal 
// Q.Convert Decimal to binary
import java.util.Scanner;
public class functionsAndMethods {
    // Factorial
    public static int factorial(int num) {
        // nCr = n!/r!(n-r)!
        int fact = 1;
        for(int i = num; i >= 1; i-- ){
            fact *= i;
        }
        return fact;
    }
    // Method Overloading
    public static int sum(int a , int b){
        return a+b;
    }
    
    public static float sum(float a, float b, float c){
        return a + b + c;
    }

    // Prime or not for num >= 2
    public static boolean prime(int num){
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(num)/*OR (num - 1)*/; i++){
            if( num % i == 0){
                return false;
            }
        }
        // if(isPrime == true){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return true;
    }
    // To get primes in range 
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

    // Binary to decimal
    public static void convertDecimal(int n){
        int dec = 0;
        int power = 0;
        while(n > 0){
            int lastdigit = n % 10;
            dec = (int)(dec + (lastdigit * Math.pow(2, power)));
            power++;
            n /= 10; 
        }
        System.out.println(dec);
    }
    // Decimal to binary
    public static void convertBinary(int n){
        // Divide by 2 until n != 0
        int bin = 0;
        int power = 0;
        while (n > 0){
            int rem = n % 2  ;
            bin = (int)(bin + (rem * Math.pow(10, power)));
            power++;
            n /= 2;
        }
        System.out.println(bin);
    }



    public static void main(String[] args) {
        // Q.find Binomial Coefficient 
        // System.out.println("Binomial Coefficient ");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value for n: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the value for r: ");
        // int r = sc.nextInt();
        // int binomialCoefficient =  factorial(n)/(factorial(r)*factorial(n-r));
        // System.out.println("The binomial Coefficient is "+binomialCoefficient);
        
        // Q method Overloading
        // The function name should stay the same but the datatype and return type can change
        // int result1 = sum(23, 7);
        // float result2 = sum(23.2f, 12.1f, 2.9f);
        // System.out.println(result1 + " " + result2); 

        // Q.Prime no or not 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your range for printing prime number");
        // int n = sc.nextInt();
        // System.out.println(prime(12));
        // primesInRange(n);

        convertBinary(5);

    }

}
