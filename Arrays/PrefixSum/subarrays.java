// https://leetcode.com/problems/maximum-subarray/description/
package Arrays.PrefixSum;

public class subarrays {

    // Approach 1 - BRUTE FORCE
    // Time complexity is O(n^3)
    public static int subArrays(int arr[]){
        int sum;
        int max = Integer.MIN_VALUE;    
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    max = Math.max(max, sum);
                }
            }            
        }
        // System.out.println(max);
        return max;
    }

    // time complexity O(n^2)
    public static int prefixSum(int nums[]){
        int prefarr[] = new int[nums.length];
        prefarr[0] = nums[0];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // Another way of getting prefix array
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     prefarr[i] = sum;
        //     System.out.println(prefarr[i]);
        // }
        // max = prefarr[end] - prefarr[start -1];

        for(int i = 1; i< prefarr.length; i++){
            prefarr[i] = prefarr[i-1] + nums[i];
        }

        for(int i = 0; i< nums.length; i++){
            for (int j = i; j <nums.length; j++){
                sum = i == 0 ? prefarr[j] : prefarr[j] - prefarr[i - 1];
                max = Math.max(sum, max);
            }            
        }
        return max;
    }

    public static int kadanealgo(int nums[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean allnegative = true;
        int maxnegative = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                allnegative = false;
            }
            else{
                maxnegative = Math.max(nums[i], maxnegative);
            }
            sum += nums[i];
            if(sum < 0){
                sum = 0;
                max = 0;
            }
            max = Math.max(sum,max); 
        }
        return allnegative? maxnegative:max;
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }    
        }
        return max;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        System.out.println(subArrays(nums));
        // prefixSum(nums);
        System.out.println(prefixSum(nums));
        // System.out.println(kadanealgo(nums));
        // System.out.println(maxSubArray(nums));
    }
}
