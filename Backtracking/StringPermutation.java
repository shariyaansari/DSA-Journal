// Find all the possible permutations of a string

package Backtracking;

public class StringPermutation {
    public static void permutations(String str, String ans){
        // base case when length of string becomes
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, ans+curr);
        }
    } 
    public static void main(String[] args) {
        permutations("abcd", "");
    }
}
