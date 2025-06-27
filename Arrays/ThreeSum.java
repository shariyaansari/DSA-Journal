// https://leetcode.com/problems/3sum/description/
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSumBrute(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    
    public static List<List<Integer>> threeSumLessOptimized(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        // Step 1 done - sorting an array
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    set.add(triplet);
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> threeSumOptimized(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        // Step 1 done - sorting an array
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;

                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                        set.add(triplet);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr[] = { -1,0,1,-1,0,1};
        // System.out.println(threeSumBrute(arr));
        System.out.println(threeSumOptimized(arr));
    }

}
