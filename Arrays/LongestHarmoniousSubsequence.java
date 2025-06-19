/*  https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=problem-list-v2&envId=sliding-window */
package Arrays;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
       Arrays.sort(nums);
       int difference = 0;
       int maxlen = 0;
       int si = 0; 
       int ei = 0;
       while(ei < nums.length){
        while(nums[ei] - nums[si] > 1){
            si++;
        }
        if(nums[ei] - nums[si] == 1){
            maxlen = Math.max(maxlen, ei-si+1);
        }
        ei++;
       }
       return maxlen;
    }
    
}
