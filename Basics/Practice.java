package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Practice {
    public static void twoSum(int arr[]){
        int right = arr.length-1;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < arr.length;i++){
            int left = i+1;

            while(left < right){
                if(arr[i] + arr[left] + arr[right] == 0){
                    List<Integer> triplet = Arrays.asList(arr[i], arr[left],arr[right]);
                    set.add(triplet);
                    left++;
                    right--;
                }
                else if(arr[i] +arr[left] + arr[right] > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1};
        twoSum(arr);
    }
}
