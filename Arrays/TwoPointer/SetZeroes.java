package Arrays.TwoPointer;

public class SetZeroes {
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                newArr[index] = nums[i];
                index++;
            }
        }
        for(int i = 0; i < newArr.length;i++){
            nums[i] = newArr[i];
        }
        return nums;
    }
    public static void moveZeroesApproach2(int[] nums) {
        int left = 0;
        int right = 0;
        while(right < nums.length){
            while(nums[right] == 0){
                right++;
                // continue;
            }
            int temp;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        // moveZeroes(arr);
        moveZeroesApproach2(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
