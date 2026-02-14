package BinarySearch;

public class InfiniteArraySearch {
    public static int ans(int nums[], int target){
        // First find the range
        // Start with the box of 2
        int start = 0; 
        int end = 1;
        
        while(target > nums[end]){
            int newstart = end+1;

            // end = prev index of end + sizeofthebox*2
            int newend = end + (end-start+1)*2;
            start = newstart;
            end = newend;
        }
        // System.out.println(start+ ", " + end);
        return search(nums, target, start, end);
    }


    public static int search(int nums[], int target, int start, int end){
         
        while (start <= end) {
            int mid = (start+end)/2;

            if (nums[mid] == target){
                return mid;
            }
            // right
            if(nums[mid] < target){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int nums[] = {1,8,9,10,13,17,19,20,21,28,30,34,36,39,40,41,47,50};
        // Start with the box of 2
        int target = 9;
        int result = ans(nums, target);
        System.out.println(result);
    }
    
}
