package BitManipulation;

public class CheckEvenOdd {
    public static boolean isEven(int number){
        int bitmask = 1;
        if((number & bitmask) == 1){
            return false;
        }
        return true;

        
    }
    public static void main(String[] args) {
        System.out.println(isEven(9));
    }
    
}
