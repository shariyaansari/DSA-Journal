package Arrays.General;
// https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;
public class ValueAppearance {
    // Q.1
    // approach 1
    public static boolean checkValeappearance(int[] nums){
        // BRUTE FORCE
        // int appearedvalue = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    // appearedvalue++;
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
    // Approach 3 - can't work for big numbers in array since it takes up space in memory 
    // Solve this again when done with hashmaps
    public static boolean approach3(int[] nums){
        // Largest element for array size 
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length;i++){
            largest = Math.max(nums[i], largest);
            smallest = Math.min(nums[i],smallest);
        }
    
        int offset = -smallest;
        int[] count = new int[largest - smallest +1 ];
    
        for (int num : nums) {
            count[num + offset]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if(count[i] > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,11};
        // System.out.println(checkValeappearance(nums));
        // System.out.println(approach2(nums));
        System.out.println(approach3(nums));

        
    }
}
