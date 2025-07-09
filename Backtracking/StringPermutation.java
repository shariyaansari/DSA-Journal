// Find all the possible permutations of a string

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void permutations(String str, String ans){
        // base case when length of string becomes
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, ans+curr);
        }
    } 
    public static void permutations(int[] arr,boolean[] visited, List<Integer> current,List<List<Integer>> result){

        // base case when length of string becomes
        if(current.size() == arr.length){
            // since substring funda is not working so the base case differed the array size will never decrease to 0...so therefore we will track the size of current when that reaches array size we got a combination.
            result.add(new ArrayList<>(current));
            // System.out.println(result);
            return;
        }
        // In arrays we can't get the substring as easyily as we get in string so we will have to use another method which is by using a visited[] array that would track for the particular array's element is used or not 
        for(int i = 0; i < arr.length;i++){
            // If visited is not true then only it will be considered 
            if(!visited[i]){
                visited[i] = true;
                current.add(arr[i]);

                // Recursion step 
                permutations(arr,visited, current,result);

                // Backtrack step where I go back and delete the element 
                current.remove(current.size()-1);
                // Then set the visited as false
                visited[i] = false;
            }            
        }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean[] visited = new boolean[arr.length];
        List<List<Integer>> result = new ArrayList<>();
        permutations("abc", "");
        permutations(arr, visited,new ArrayList<>(), result);
        System.out.println(result);
    }
}
