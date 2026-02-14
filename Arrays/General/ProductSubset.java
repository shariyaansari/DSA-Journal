// Leetcode contest - https://leetcode.com/problems/partition-array-into-two-equal-product-subsets/
package Arrays.General;

public class ProductSubset {
    // // Works for 714/720 test cases
    public static boolean checkEqualPartitions(int[] nums, long target) {
        for(int i = 0; i < nums.length;i++){
            if(target % nums[i] != 0){
                return false;
            }
        }
        long product = 1;
        for(int i = 0; i < nums.length;i++){
            product *= nums[i];
        }
        if(product != target * target){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,8,4};
        boolean result = checkEqualPartitions(arr, 24);
        System.out.println(result);
    }
}
