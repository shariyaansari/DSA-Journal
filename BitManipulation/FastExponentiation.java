package BitManipulation;

import Arrays.General.returnIndex;

public class FastExponentiation {
    public static int exponentialCalc(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n&1) == 1){
                ans *= a;
            }
            else{
                ans *= 1;
            }
            a *= a;
            n = n>>1;
        } 
        return ans; 
    }
    public static void main(String[] args) {
        System.out.println(exponentialCalc(3, 5));
    }
      
}
