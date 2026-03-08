package recursion;
import java.util.*;

public class PrintAllSubsequence {
    public static void subsequence(ArrayList<Integer> arr, int[] nums, int idx){
        if(idx >= nums.length){
            printArr(arr);
            return;
        }
        arr.add(nums[idx]);
        // take case
        subsequence(arr, nums, idx+1);
        
        // Not take case 
        arr.remove(arr.size()-1);
        subsequence(arr, nums, idx+1);
    }
    public static void printArr(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        ArrayList<Integer> arr = new ArrayList<>();
        subsequence(arr, nums, 0);
    }  
}
