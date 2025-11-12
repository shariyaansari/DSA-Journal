// https://leetcode.com/problems/minimum-absolute-difference/
// package Arrays.General;

import java.util.ArrayList;
import java.util.List;

public class MinAbsoluteDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int mindiff = Math.abs(arr[0] - arr[1]);
        for(int i = 1;i < arr.length-1; i++){
            int diff = 0;
            diff = Math.abs(arr[i] - arr[i+1]);
            mindiff = Math.min(mindiff, diff);
        }
        // res.add(Arrays.asList(arr[0], arr[1]));
        System.out.println(mindiff);
        for(int i = 0; i < arr.length-1; i++){
            int currentDiff = 0;
            currentDiff = Math.abs(arr[i] - arr[i+1]);
            if(currentDiff == mindiff){
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
