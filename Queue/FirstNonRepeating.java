// https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
package Queue;

import java.util.*;

public class FirstNonRepeating {
        public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Integer> q = new LinkedList<>();
        // Frequency counting
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            q.add(i);
            while(!q.isEmpty() && freq[s.charAt(q.peek()) - 'a'] > 1){
                q.remove();
            }
        }
        if (q.isEmpty()) {
            return -1;   
        } else {
            return q.peek(); 
        }
    }
    public static void main(String[] args) {
        
    }
}
