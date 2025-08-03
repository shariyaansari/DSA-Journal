package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public static void subset(String str, int i, String ans){
        System.out.println("entering: i = " + i + ",ans= " + ans);
        // Base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Kaam 
        // If choice is Yes
        subset(str, i+1, ans+str.charAt(i)); 
        // If choice is No 
        System.out.println("Abt to enter Backtracking: i=" + i + ", ans=" + ans);
        subset(str, i+1, ans); 
        System.out.println("Backtracking: i=" + i + ", ans=" + ans);

    }
    public static void subset(String str, int i, StringBuilder ans){
        // Base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans.toString());
            }
            return;
        }
        // Kaam 
        // If choice is Yes
        ans.append(str.charAt(i));
        subset(str, i+1, ans); 
        ans.deleteCharAt(ans.length()-1);
        // If choice is No 
        subset(str, i+1, ans); 
    }
    public static void subset(int[] nums, int i, List<Integer> current,List<List<Integer>> result){
        // Base case 
        if(i == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // Kaam 
        // If choice is Yes
        current.add(nums[i]);
        subset(nums, i+1, current, result); 
        // If choice is No 

        current.remove(current.size()-1);
        subset(nums, i+1, current, result); 
    }
    public static void main(String[] args) {
        // String str = "ab";
        // subset(str, 0, "");
        // subset(str, 0, new StringBuilder());


        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1,2,2};
        subset(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}
