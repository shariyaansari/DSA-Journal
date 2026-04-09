package Arrays.SlidingWindow;
import java.util.*;

public class FreqOfMostFreqElement {
    public static int maxFrequency(int[] nums, int k) {
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        int max = 1; 
        int j = 0;
        long sum = 0; 
        for(int i = 0; i < nums.length;i++){
            sum += nums[i]; 
            while((long)nums[i]*(i-j+1)-sum > k){
                sum -= nums[j]; 
                // Shrinking the window from the left;
                j++;
            }
            max = Math.max(max, i-j+1); 
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,13};
        System.out.println(maxFrequency(arr, 4));
    }
}
