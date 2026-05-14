package arrays.SlidingWindow;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        // Using Sliding window 
        int left = 0; 
        // HashMap<Character, Integer> map = new HashMap<>(); 
        // Without the hasmap cause of less overhead 
        int[] hashmap = new int[256]; 
        for(int i = 0; i < 256; i++){
            hashmap[i] = -1;
        }

        int max = 0;
        int right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(hashmap[ch] != -1){
                if(hashmap[ch] >= left){
                    left = hashmap[ch] + 1; 
                }
            }
            hashmap[ch] = right;
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }    
}
