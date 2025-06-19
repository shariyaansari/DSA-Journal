// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
package Arrays;

public class returnIndex {

    public static int returnIndexApproach1(int nums[], int target){
        // Brute Force with time complexity O(n)
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    // approach2
    public static int returnIndexApproach2(int nums[], int target){
        // Brute Force with time complexity O(n)
        // Sort the array and the apply binary search.
        // Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1; 
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] >= target){
                    end = mid - 1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(nums[mid] <= target && nums[end] >= target){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        // System.out.println(returnIndex(nums, 2));
        System.out.println(returnIndexApproach2(nums, 0));
    }
    
}
