// https://leetcode.com/problems/longest-repeating-character-replacement/description/
package Strings;

public class LongestRepeatingCharReplacement {
    public static int characterReplacement(String s, int k) {
        int max = Integer.MIN_VALUE;
        int n = s.length();
        int[] storeCount = new int[26];
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        // Making an array to store count of each alpha
        for(int i = 0; i < n;i++){
            char ch = s.charAt(i);
            int index = ch - 'A';
            storeCount[index]++;
            
            maxFreq = Math.max(maxFreq, storeCount[index]);

            while ((i - left +1)-maxFreq > k)  {
                storeCount[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result,i-left+1);
        }
        return result;

        
    }
    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));
    }
}
