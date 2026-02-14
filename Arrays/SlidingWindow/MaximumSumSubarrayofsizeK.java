//  https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
package Arrays.SlidingWindow;

public class MaximumSumSubarrayofsizeK {
    public static int maxSum(int nums[], int k){
        int i =0;
        int j =0;
        int n = nums.length-1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(j < n){
            sum = sum+nums[j];
            if((j-i+1) < k){
                j++;
            }
            if(j-i+1 == k){
                max = Math.max(max, sum);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // int nums[] = {2,5,1,8,2,9,1};
        // int k =4;
    }
    
}
