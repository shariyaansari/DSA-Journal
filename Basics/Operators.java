package Basics;
public class Operators {
    public static void main(String[] args) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp1 = 4/3 * (x + 34);
        System.out.println(exp1);
        
        int exp2 = 9 * (a + b * c);
        System.out.println(exp2);
        
        int exp3 = (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp3);
        
        int res = exp1+ exp2+exp3;
        System.out.println(res);
    }
}