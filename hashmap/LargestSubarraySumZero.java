package hashmap;
import java.util.*;

public class LargestSubarraySumZero {
    public static int brute(int[] arr){
        int max = 0; 
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
    public static int Optimized(int[] arr){
        int max = 0;  //setting the maxCount of the subArray as 0
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int sum = 0;   //Initialize the sum
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];    //step 1 -> get the sum
            // check if that sum alr exists in the map
            if(map.containsKey(sum)){
                max = Math.max(max, j - map.get(sum));
            }
            map.put(arr[j], j);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(brute(arr));
        System.out.println(Optimized(arr));
    }
}
