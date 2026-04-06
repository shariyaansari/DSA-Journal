package hashmap;
import java.util.*;

public class CountSubarraysWithSumK {
    public static int getSum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(nums[j], 0) + 1);

        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
