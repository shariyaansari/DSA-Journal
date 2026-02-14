// Print the sum,difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
package OOPS;

import java.util.Scanner;

class PrintSumOfImgAndReal {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first complex number:(Real and imaginary both parts)");
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        System.out.print("Enter Second complex number:(Real and imaginary both parts)");
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        sc.close();

        
        // Object of the class
        Complex calc = new Complex();
        // Calling out functions for calculations
        calc.sum(real1, imaginary1,real2, imaginary2);
        calc.sub(real1, imaginary1,real2, imaginary2);
        calc.product(real1, imaginary1,real2, imaginary2);
    
        
    }
}

class Complex {
    public void sum(int real1, int imaginary1,int real2, int imaginary2) {
        int real = real1+real2;
        int imaginary = imaginary1+imaginary2;
        System.out.println("Real part is "+real);
        System.out.println("Imaginary part is "+imaginary);
    }

    public void sub(int real1, int imaginary1,int real2, int imaginary2) {
        int real = real1-real2;
        int imaginary = imaginary1-imaginary2;
        System.out.println("Real part is "+real);
        System.out.println("Imaginary part is "+imaginary);
    }

    public void product(int real1, int imaginary1,int real2, int imaginary2) {
        int real = real1*real2;
        int imaginary = imaginary1*imaginary2;
        System.out.println("Real part is "+real);
        System.out.println("Imaginary part is "+imaginary);
    }
}