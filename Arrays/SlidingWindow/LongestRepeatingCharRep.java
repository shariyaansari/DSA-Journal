package arrays.SlidingWindow;

public class LongestRepeatingCharRep {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] chars = new int[26];
        // O(N)
        while (right < s.length()) {
            char ch = s.charAt(right);
            chars[ch - 'A']++;
            maxFreq = Math.max(maxFreq, chars[ch - 'A']);
            if ((right - left + 1) - maxFreq > k) {
                // shrink the window
                chars[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));
        
    }
}
