// https://leetcode.com/problems/longest-palindromic-substring/
package Strings;

public class LongestPalindromeSubstring {
    public static boolean isHelper(String s){
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String longestPalindrome(String s){
        String longestSubstring = "";
        int maxlen = 0;
        for(int i = 0 ; i < s.length();i++){
            for(int j = i ; j < s.length();j++){
                if(isHelper(s.substring(i, j+1)) == true){
                    if(j-i+1 > maxlen){
                        maxlen = j-i+1;
                        longestSubstring = s.substring(i,j+1);
                    }                    
                }
            }
        }
        return longestSubstring;
    }
    // Approach 2
    // Center based approach 
    public static String isHelperforApproach2(String s, int left, int right){
        int maxlen = 0;
        String longest = "";
        while(left <= right){
            if( left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            if(right - left +1 > maxlen){
                maxlen = right - left + 1;
                longest = s.substring(left+1, right);
            }
        }
        return longest;
    }
    public static String SlidingWindowApp(String s){
        int maxlen = 0;
        String longestPalindrome = "";
        for(int i = 0; i < s.length();i++){
            String odd = isHelperforApproach2(s, i, i);
            String even = isHelperforApproach2(s, i, i+1);
            if(odd.length() > longestPalindrome.length()){
                longestPalindrome = odd;
            }
            if(even.length() > longestPalindrome.length()){
                longestPalindrome = even;
            }
        }
        return longestPalindrome;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabbaa"));
        System.out.println(longestPalindrome("babad"));
    }
}
