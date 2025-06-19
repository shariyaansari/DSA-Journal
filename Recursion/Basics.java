package Recursion;

public class Basics {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        else{
            System.out.println(n);
            printDec(n-1);
        }
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // printDec(10);
        printInc(10);
    }
}
