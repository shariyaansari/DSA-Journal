// https://leetcode.com/problems/product-of-array-except-self/description/
package Arrays;

public class productexceptself {
     public static int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int new_arr[] = new int[n];
        new_arr[0] = 1;
        for(int i = 1; i < n; i++){
            new_arr[i] = nums[i-1] * new_arr[i-1];
            // System.out.println(new_arr[i]);
        }

        int right = 1;
        // int new_arr[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            new_arr[i] = new_arr[i] * right;
            right = right*nums[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        int nums[] = {-1, 1, 0, -3, 3};
        productExceptSelf(nums);
        for(int i = 0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
        
    }
}
