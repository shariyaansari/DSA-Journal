// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
package BinarySearch;

public class FirstandLastPosition {
    public static void firstandlastBrute(int[] nums, int target){
        int n = nums.length;
        int[] found = new int[2];
        for(int i =0; i <n; i++){
            if(nums[i] == target){
                found[0] = i; 
                break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(nums[i] == target){
                found[1] = i; 
                break;
            }
        }
        System.out.println(found[0] + " " + found[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
       
        int[] found = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        found[0] = start;
        found[1] = end;
        System.out.println(start + " "+ " "+ end);
        return found;
        
    }

    public static int search(int[] nums, int target, boolean firststartindex){
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        // Check for first occurence of target
        while (start <= end) {
            int mid = (start+end)/2;

            if (nums[mid] == target){
                // potential ans found
                ans = mid;
                if(firststartindex){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
            // right
            else if(nums[mid] < target){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return ans; 
    }

    public static void twoPointerapproach(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;

        while(right < arr.length){
            if(arr[left] != target){
                left++;
            }
            if(arr[right] != target){
                right--;
            }
            else{
                System.out.println("{"+left+","+right+"}");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        // System.out.println(searchRange(nums, 8));
        searchRange(nums, 8);
        twoPointerapproach(nums, 7);
    }
}
