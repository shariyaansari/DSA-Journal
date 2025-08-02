// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package BinarySearch;

public class SingleElementInSorted {
    public static int SingleElement(int[] nums){
         // Find max 
        int max = nums[0];

        for(int i =1; i < nums.length;i++){
            max = Math.max(max, nums[i]);
        }

        int[] count = new int[max+1];
        for(int index: nums){
            count[index]++;
        }

        for(int i =0; i < count.length;i++){
            if(count[i] == 1){
                return i;
            }
        }
        return -1;
    }
    // Worked but failed at some edge cases
    public static int singleNonDuplicate(int[] nums) {
         int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start+end)/2;
            if(mid % 2 != 0){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){
                start = mid+2;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4}; 
        System.out.println(singleNonDuplicate(arr));
        // singleNonDuplicate(arr);
    }
}
