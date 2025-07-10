package Arrays.General;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleCombinations {
    // Have to try tomorrow
    public static void subsets(int[] arr, int r, int index, List<Integer> current, List<List<Integer>> result){
        // Base case
        if(current.size() == r){
            result.add(new ArrayList<>(current));
            // System.out.println(current);
            return;
        }
        // Kaam
        for(int i = index; i < arr.length;i++){
            // This line is for skipping the duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;
            current.add(arr[i]);
            // Recursion
            subsets(arr, r, i+1, current, result);
            // Backtracking
            current.remove(current.size()-1);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subsets(arr, 2, 0, new ArrayList<>(), new ArrayList<List<Integer>>());
    }
}
