// https://leetcode.com/problems/maximum-product-subarray/description/
package Arrays;

public class maxproductsubarray {
    public static void product(int[] arr) {
        int[] prefix = new int[arr.length];
        int n = arr.length;
        prefix[0] = arr[0];
        for(int i = 1; i < n ; i++){
            prefix[i] = prefix[i-1] * arr[i];
            System.out.println(prefix[i]);
        }
    }
    public static int product2(int[] arr) {
        int prefix = 0;
        int suffix = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix *= arr[i];
            suffix *= arr[arr.length -1-i];
            max = Math.max(max, Math.max(suffix,prefix));
        }
        return max;
    }
    public static int approach3(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1]* arr[i];
            // System.out.println(prefix[i]);
        }
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i+1]* arr[i];
            // System.out.println(suffix[i]);
        }

        int max = 0;
        for(int i =0; i<n;i++){
            max = Math.max(suffix[i], prefix[i]);
        }
        return max;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,8,1};
        System.out.println(approach3(arr));
        // approach3(arr);
    }
    
}
