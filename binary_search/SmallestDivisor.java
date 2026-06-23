package binary_search;

public class SmallestDivisor {
    public boolean helper(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % divisor == 0) {
                sum += nums[i] / divisor;
            } else {
                sum += (nums[i] / divisor) + 1;
            }
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int start = 1;
        int end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (helper(nums, mid, threshold)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    public static void main(String[] args) {
        
    }
}

