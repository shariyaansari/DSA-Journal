// https://leetcode.com/problems/set-mismatch/description/
package Arrays;
import java.util.*;
import java.util.Arrays;

public class ExpectedSums {
    public static void sum(int[] nums){
        int n = nums.length;
        int ExpectedSums = n*(n+1)/2;
        int actualSum = 0;
        for(int i = 0 ; i < n; i++){
            actualSum += nums[i];
        }
        Arrays.sort(nums);
        int missing[] = new int[2];
        // Find the duplicated number;
        for(int i = 0; i < n-1 ; i++){
            if(nums[i] == nums[i+1]){
                missing[0] = nums[i];
                // break;
            }
        }
        missing[1] = ExpectedSums - (actualSum - missing[0]);
        System.out.println(missing[0] + " " + missing[1]);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,9,6,7,8,9};
        sum(nums);
    }
}
