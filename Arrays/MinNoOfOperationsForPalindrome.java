// https://www.geeksforgeeks.org/dsa/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/
package Arrays;

public class MinNoOfOperationsForPalindrome {
    // Right but missed some edge cases like - {1,4,5,9,1}
    public static int minOp(int[] nums){
        int left =0;
        int right = nums.length-1;
        int max = nums.length-1;
        while(left < right){
            if(nums[left] == nums[right]){
                right--;
                left++;
                max -= 2;
                if(max < 0){
                    return 0;
                }
            }
            else{
                left++;
                right--;
            }
        }
        return max;
    }
    public static int approach2(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int ops = 0;
        while(left < right){
            if(nums[left] == nums[right]){
                left++;
                right--;
            }
            else if(nums[left] < nums[right]){
                nums[left+1] += nums[left];
                left++;
                ops++; 
            }
            else{
                nums[right-1] += nums[right];
                right++;
                ops++; 
            }

        }
        return ops;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,5,9,1};
        // System.out.println(minOp(nums));
        System.out.println(approach2(nums));
    }
}
