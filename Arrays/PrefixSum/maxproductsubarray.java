// https://leetcode.com/problems/maximum-product-subarray/description/
package Arrays.PrefixSum;

public class maxproductsubarray {
    // Brute
    public static int product(int[] arr) {
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            product = 1;
            for(int j = i; j < arr.length;j++){
                product *= arr[j];
                if(product > maxProduct){
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }
    // Prefix-suffix approach
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
    // Using kadane's algo
    public static int approach3(int arr[]){
        int product = 1;
        int maxProduct = arr[0];
        int max = arr[0];
        int min = arr[0];
        if(arr.length == 1){
            return arr[0];
        }

        for(int i = 1;i < arr.length;i++){
            int temp = max;
            max = Math.max(arr[i], Math.max(max*arr[i],min*arr[i]));
            min = Math.min(arr[i], Math.min(temp*arr[i], min*arr[i]));
            maxProduct = Math.max(max,maxProduct);
        }
        return maxProduct;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,8,1};
        System.out.println(approach3(arr));
        // approach3(arr);
    }
    
}
