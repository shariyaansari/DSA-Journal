package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void brute(int[] arr){
        int[] res = new int[arr.length];
        int index = 0;
        boolean stored = false;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    break;
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
    public static void main(String[] args) {
        int[] arr = {10,9,4,5,6};
        // brute(arr);
        opt(arr);
    }
}
