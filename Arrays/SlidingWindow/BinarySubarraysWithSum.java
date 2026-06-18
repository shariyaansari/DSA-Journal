package arrays.SlidingWindow;

public class BinarySubarraysWithSum {
    public static int atMost(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 3;
        System.out.println(atMost(nums, goal) - atMost(nums, goal - 1));
    }    
}
