package recursion;
import java.util.*;


// Studying all subsequence patterns
public class SubsequenceWhoseSumIsK {
    
    // print subsequrnce whose sum is k 
    public static void subsequence(ArrayList<Integer> arr, int[] nums, int idx, int sum, int req){
        if(idx >= nums.length){
            if(req == sum){
                printArr(arr);
            }
            return;
        }
        arr.add(nums[idx]);
        // take case
        subsequence(arr, nums, idx+1, sum, req+nums[idx]);
        req -= nums[idx];

        // Not take case 
        arr.remove(arr.size()-1);
        subsequence(arr, nums, idx+1,sum, req+nums[idx]);
    }


    // Print the first subsequence with sum k -> this has only one answer
    public static boolean subsequenceOneAnswer(ArrayList<Integer> arr, int[] nums, int idx, int sum, int req){
        if(idx >= nums.length){
            if(req == sum){
                printArr(arr);
                // condition satisfied
                return true;
            }
            return false; //condition not satisfied
        }
        arr.add(nums[idx]);   
        // take case
        // We just want to avoid the future recursion calls for which we stop and return true as soon as we find the ans 
        if(subsequenceOneAnswer(arr, nums, idx+1, sum, req+nums[idx]) == true){
            return true;
        }
        req -= nums[idx];

        // Not take case 
        arr.remove(arr.size()-1);
        return subsequenceOneAnswer(arr, nums, idx+1,sum, req+nums[idx]);
    }
    // Print count of subsequence whose sum is k 
    public static int Countsubsequence(ArrayList<Integer> arr, int[] nums, int idx, int sum, int req){
        // if array contains only positives 
        if(req > sum){
            return 0;
        }
        if(idx >= nums.length){
            if(req == sum){
                // printArr(arr);
                // condition satisfied
                return 1;
            }
            return 0; //condition not satisfied
        }
        arr.add(nums[idx]);  
        // take case
        // We just want to avoid the future recursion calls for which we stop and return true as soon as we find the ans 
        int left = Countsubsequence(arr, nums, idx+1, sum, req+nums[idx]);
        req -= nums[idx];

        // Not take case 
        arr.remove(arr.size()-1);
        int right = Countsubsequence(arr, nums, idx+1, sum, req+nums[idx]);
        return left+right;
    }



    public static void printArr(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        ArrayList<Integer> arr = new ArrayList<>();
        // subsequence(arr, nums, 0, 2, 0);
        // subsequenceOneAnswer(arr, nums, 0, 2, 0);
        System.out.println(Countsubsequence(arr, nums, 0, 2, 0));
    }  
}
