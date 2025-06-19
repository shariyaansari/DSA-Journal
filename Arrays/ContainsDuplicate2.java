// https://leetcode.com/problems/contains-duplicate-ii/description/?source=submission-noac
package Arrays;

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
    public static void main(String[] args) {
        int nums[] = {1,3,4,6,7,1};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }   
}
