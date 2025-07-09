// https://leetcode.com/problems/combinations/submissions/1692226749/
package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void helper(int[] arr, int k, int index, List<Integer> current, List<List<Integer>> result){
        // Base case 
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index; i < arr.length ; i++){
            // if (i > index && arr[i] == arr[i - 1]) continue;
            current.add(arr[i]);
            // Recursion 
            helper(arr,k,i+1,current, result);
            current.remove(current.size()-1);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i =0 ; i < n;i++){
            arr[i] = i+1;
        }
        List<List<Integer>> result = new ArrayList<>();
        helper(arr,k,0,new ArrayList<>(),result);
        return result;         
    }
    public static void main(String[] args) {
        // combine(4,6);
        System.out.println(combine(4,3));
    }
}
