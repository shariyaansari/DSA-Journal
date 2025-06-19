package Basics;
// Question 1:In a program,input 3 numbers:A,BandC.You have to output the average of these 3 numbers.
// Question2:In a program,input the side of a square.You have to output the area of the square
import java.util.Scanner;

public class VariablesPS{
    public static void main(String[] args) {
        // Question 1:In a program,input 3 numbers:A,BandC.You have to output the average of these 3 numbers.
        System.out.println("Enter 3 numbers A B and C to get the average : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A + B + C)/3;
        System.out.println("The average of the numbers is: " + average);

        // Question2:In a program,input the side of a square.You have to output the area of the square
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of the square is "+area);
    }
}
