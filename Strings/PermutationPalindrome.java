// From the book 
// Given a string right to function to check if it is a permutation of a palindrome.A palindrome is a word or phrase that is the same forwards and backwards.A permutation is a rearrangement of letters.The palindrome does not need to be limited to just dictionary words.
package Strings;

public class PermutationPalindrome {
    public static boolean isPalindromePermutation(String str){
        // 2 case - odd length and even length 
        // odd - there should be exactly 1 letter that has frequency 1 rest all should have frequency 2
        // For even palindrome- all the letter has to appear twice.
        
        int[] storecount = new int[26];
        // Calculating frequency of each character.
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int index = ch - 'a';
            storecount[index]++;
        }
        int countOdd = 0;
        for(int i = 0; i < storecount.length;i++){
            System.out.print(storecount[i]);
            if(storecount[i] % 2 == 1){
                countOdd++;
            }
        }
        System.out.println(countOdd);
        if(countOdd %2 ==  1 || countOdd == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("maam"));
    }
}
