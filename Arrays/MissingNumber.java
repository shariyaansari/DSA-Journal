package Arrays;

public class MissingNumber {
    public static void findMissingNum(int[] nums){
        int miss = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == miss){
                miss++;
            }
        }
        System.out.println(miss);
    }

    // Another method using Maths formula
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i = 0; i < n ; i++){
            actualSum += nums[i];
        }
        int missed = expectedSum - actualSum;
        System.out.println(missed);
        return missed;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        findMissingNum(arr);
        missingNumber(arr);
    }    
}
