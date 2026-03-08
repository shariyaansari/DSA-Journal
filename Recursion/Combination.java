package recursion;
import java.util.*;

public class Combination {
    public static void getCombinations(int[] arr, int index, int target,List<List<Integer>> res, List<Integer> ds){
        // Base case 
        if(index == arr.length){
            if(target == 0){
                res.add(new ArrayList<Integer>(ds));
            }
            return;                
        }
        // Take case 
        if(arr[index] <= target){
            ds.add(arr[index]);
            getCombinations(arr, index, target-arr[index], res, ds);
            ds.remove(ds.size()-1);
        }
        // Not take 
        getCombinations(arr, index+1, target, res, ds);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        ArrayList<List<Integer>> res = new ArrayList<>();
        getCombinations(arr, 0, 7, res, new ArrayList<>());
        System.out.println(res);
    }
}
