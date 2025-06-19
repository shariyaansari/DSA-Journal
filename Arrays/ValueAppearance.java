package Arrays;
// https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;
public class ValueAppearance {
    // Q.1
    // approach 1
    public static boolean checkValeappearance(int[] nums){
        // BRUTE FORCE
        int appearedvalue = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    appearedvalue++;
                    return true;
                }
            }
        }
        return false;
    }
    
    // approach 2
    public static boolean approach2(int[] nums){
        // second approach
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        // System.out.println(checkValeappearance(nums));
        // System.out.println(approach2(nums));

        
    }
}
