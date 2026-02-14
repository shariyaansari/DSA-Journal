// https://leetcode.com/problems/valid-palindrome/
package Strings;

public class Palindrome {
    public static boolean palindrome(String str){
        // String lowercase = str.toLowerCase();
        // int n = str.length();
        // for(int i = 0 ; i < str.length()/2; i++){
        //     if(str.charAt(i) != str.charAt(n-1-i)){
        //         return false;
        //     }
        // }
        // return true;
        String lowercase = str.toLowerCase();

        int n = str.length();
        for(int i = 0 ; i < lowercase.length()/2; i++){
            if (Character.isLetterOrDigit(lowercase.charAt(i)) || lowercase.charAt(i) == ' ') {
                continue;
            }
            if(lowercase.charAt(i) != lowercase.charAt(n-1-i) && lowercase.charAt(i) >= 'a' && lowercase.charAt(i) <= 'z'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(str));
        // palindrome("Madam");    
    }
}
