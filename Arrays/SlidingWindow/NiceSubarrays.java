package arrays.SlidingWindow;

public class NiceSubarrays {
    public static int helper(int[] nums, int k){
        int right = 0, left = 0;
        int count = 0;
        int sum = 0;
        if(k < 0){
            return 0;
        }
        while(right < nums.length){
            sum += nums[right];
            while(sum > k){ 
                sum -= nums[left];
                left++;
            }
            count += right - left+1;
            right++;
        }    
        return count;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        return helper(nums, k) - helper(nums, k - 1);
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 1 };
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k));
    }
}
