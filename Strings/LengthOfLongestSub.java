// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
package Strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSub {

    public int lengthOfLongestSubstringBrute(String s) {
        int maxlen = 0;
        for(int i = 0; i < s.length();i++){
            for(int j = i; j< s.length();j++){
                if(isUnique(s, i, j)){
                    maxlen = Math.max(j-i+1, maxlen);
                }
            }
        }
        return maxlen;
    }
    public boolean isUnique(String s,int start, int end){
        boolean[] seen = new boolean[256];
        for(int i = start; i <= end;i++){
            int ch = s.charAt(i);
            if(seen[ch]){
                return false;
            } 
            seen[ch] = true;
        }
        return true;
    } 

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s ="abcabc";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

