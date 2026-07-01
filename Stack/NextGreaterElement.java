package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void brute(int[] arr){
        int[] res = new int[arr.length];
        // int index = 0;
        // boolean stored = false;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    // break;
                }
                if(j == arr.length-1){
                    res[j] = -1; 
                }
                else{
                    res[i] = -1;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    // Optimized approach 
    public static void opt(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length]; 
        for(int i = arr.length-1; i>=0; i--){
            while(!s.empty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.empty()){
                res[i] = -1;
            }
            else{
                res[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    // Next greater 2 
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            while (!s.isEmpty() && s.peek() <= nums[idx]) {
                s.pop();
            }
            // no need to update 2*n times, only update when i < n
            if (i < n) {
                if (s.isEmpty()) {
                    result[idx] = -1;
                } else {
                    result[idx] = s.peek();
                }
            }
            s.push(nums[idx]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2};
        // brute(arr);
        opt(arr);
    }
}
