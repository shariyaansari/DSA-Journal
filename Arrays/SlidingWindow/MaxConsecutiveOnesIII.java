package arrays.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroes++;
            }
            if (zeroes > k) {
                if (nums[left] == 0)
                    zeroes--;
                left++;
            }
            if (zeroes <= k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0 };
        System.out.println(longestOnes(nums, 2));
    }
}
