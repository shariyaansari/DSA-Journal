// https://leetcode.com/problems/combination-sum/
// https://leetcode.com/problems/combination-sum-ii/
package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {
    public static void sets(int[] arr, int i, List<Integer> current, List<List<Integer>> result,int remaining_sum){
        // This is to add the list 
        if(remaining_sum == 0){
            result.add(new ArrayList<>(current));
        }
        // Some conditions / edge case 
        if(remaining_sum < 0 || i >= arr.length){
            return;
        }
        // to calc the pair
        for(int j = i; j < arr.length;j++){
            if(j > i && arr[j] == arr[j-1]){
                continue;   
            }
            current.add(arr[j]);
            // Recursion step 
            sets(arr, j+1, current, result,remaining_sum - arr[j]);
            // Backtrack
            current.remove(current.size()-1);
        }
    }
    // Combinational sum 2 
    public static void sets2(int[] arr, int i, List<Integer> current, List<List<Integer>> result,int remaining_sum){
        // This is to add the list 
        if(remaining_sum == 0){
            result.add(new ArrayList<>(current));
        }
        // Some conditions / edge case 
        if(remaining_sum < 0 || i >= arr.length){
            return;
        }
        // to calc the pair
        for(int j = i; j < arr.length;j++){
            if(j > i && arr[j] == arr[j-1]){
                continue;   
            }
            current.add(arr[j]);
            // Recursion step 
            sets(arr, j+1, current, result,remaining_sum - arr[j]);
            // Backtrack
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,6,8};  
        List<List<Integer>> result = new ArrayList<>();
        sets(arr, 0, new ArrayList<>(), result, 8);
        System.out.println(result);
    }
}
