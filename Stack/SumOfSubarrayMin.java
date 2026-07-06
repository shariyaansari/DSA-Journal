import java.util.*;

class SumOfSubarrayMin{
    // NEXT SMALLER ELEMENT
    public int[] nextSmallerElement(int[] arr){
        int[] nse = new int[arr.length]; 
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nse[i] = arr.length;
            }else{
                nse[i] = s.peek();
            }
            s.push(i);
        }    
        return nse;
    }

    // PREVIOUS SMALLER ELEMENT
    public int[] prevSmallerElementOrEqual(int[] arr){
        int[] psee = new int[arr.length]; 
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                psee[i] = -1;
            }else{
                psee[i] = s.peek();
            }
            s.push(i);
        }    
        return psee;
    }
    
    public int sumSubarrayMins(int[] arr) {
        int[] nse = nextSmallerElement(arr);
        int[] psee = prevSmallerElementOrEqual(arr);
        
        int total = 0;
        int mod = (int) (1e9+7);

        for(int i = 0; i < arr.length; i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            long countSubarrays = (left*right) % mod;
            long contribution = (countSubarrays * arr[i]) % mod;
            total = (int) (total + contribution) % mod;
        }
        return total;
    }
    public static void main(String[] args) {
        
    }
}