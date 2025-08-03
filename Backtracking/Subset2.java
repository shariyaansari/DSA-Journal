// https://leetcode.com/problems/subsets-ii
package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Subset2 {
    public static void powerSet(int[] nums, int i,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int j = i; j < nums.length; j++){
            // avoid duplicates
            if(j > i && nums[j] == nums[j-1]) continue;
            // Choice 1 - yes
            current.add(nums[j]);
            powerSet(nums, j+1,current, result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        powerSet(nums,0,new ArrayList<>(), result);
        System.out.println(result);
    }
}
