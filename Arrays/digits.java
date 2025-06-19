// https://leetcode.com/problems/plus-one/description/
package Arrays;

public class digits {
    // fix this later 
    public static int plusOne(int[] digits){
        int combinedno = 0;
        int remainder;
        int plusone[] = new int[100];

        for(int i = 0; i < digits.length; i++){
            remainder = digits[i] % 10;
            combinedno = (10 * combinedno) + remainder;
        }
        combinedno++;
        for(int i = digits.length; i >= 0; i++){
            plusone[digits.length] =  digits[i] % 10;
        }
        for(int i = 0; i < plusone.length; i++){
            System.out.println(plusone[i]);
        }
        return combinedno;
    } 

    public static int[] approach2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;  // Add 1 and return
            return digits;
        }
        digits[i] = 0; // Set to 0 and carry over to next digit
    }

        // If we're here, all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Only the first digit is 1, rest are 0 by default
        return result;
    }
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(approach2(digits));
    }
}
