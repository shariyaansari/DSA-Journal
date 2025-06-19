package BitManipulation;

public class swap {
    //with numbers 
    public static void main(String[] args) {
        int x = 9; 
        int y = 5;
        // By using Addition
        // x = x+y;
        // y = x-y;
        // x = x-y;
        // System.out.println("x is "+x+","+"y is "+y+".");
        
        // By using bit manipulation
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x is "+x+","+"y is "+y+".");
    } 
}
