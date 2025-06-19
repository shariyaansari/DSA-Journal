package Basics;
// Implementing basic Scanner 
// import java.util.Scanner;

public class ScannerPS{
    public static void main(String[] args) {
        // System.out.println("Value in java");
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        
        // For printing sentences
        // String name = sc.nextLine();
        // System.out.println(name);

        // int num = sc.nextInt();
        // System.out.println(num);

        // double num = sc.nextDouble();
        // System.out.println(num);

        // boolean num2 = sc.nextBoolean();
        // System.out.println(num2);

        // Short num3 = sc.nextShort();
        // System.out.println(num3);

        // Type Promotion
        // Type promotions only happen with operations 
        // JAva converts short,char or byte into int while evaluating the expression. 
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);

        // If expression has long, float, or double the expression is promoted to long, float or double respectively
        
        // Example
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        // All got converted to double i.e the largest datatype 
        System.out.println(a+b+c+d);

    }
}
