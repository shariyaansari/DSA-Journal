// https://leetcode.com/problems/contains-duplicate-ii/description/?source=submission-noac
package Arrays.TwoPointer;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i < n ;i++){
            int end = Math.min(i+k, n-1);
            for(int j = i+1; j <= end;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean duplicate(int[] nums, int k) {
        int n = nums.length;
        int left = 0; 
        int right = 1;
        while(right < n){
            right = left+1;
            while(right < n && right <= (left+k)){
                if(nums[left] == nums[right]){
                    return true;
                }
                right++;
            }
            left++;
            // right++;
        } 
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,9};
        System.out.println(containsNearbyDuplicate(nums, 3));
        System.out.println(duplicate(nums, 3));
    }   
}
