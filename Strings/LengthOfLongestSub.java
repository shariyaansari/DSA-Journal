// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
package Strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSub {

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
        String s ="ejbkjdfjh";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

