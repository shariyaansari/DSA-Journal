// https://leetcode.com/problems/search-insert-position/
package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }

        }
        System.out.println(left);
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,8};
        searchInsert(arr, 5);
    }
}
