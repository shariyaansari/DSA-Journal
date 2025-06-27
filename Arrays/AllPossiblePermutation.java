//https://leetcode.com/problems/permutations/description/ 
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePermutation {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    permuteHelper(nums, 0, result);
    return result;
    }

    private void permuteHelper(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            // Convert array to list and add to result
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);  // swap current index with i
            permuteHelper(nums, index + 1, result);  // go deeper
            swap(nums, i, index);  // backtrack (undo swap)
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
