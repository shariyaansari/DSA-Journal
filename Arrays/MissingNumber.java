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

    // Using bit manipulation 
    // If we take xor of the two same numbers it returns 0 
    // Take xor of the original array along with the xor of the expected array 
    public static int missingNum(int arr[]) {
        // code here - doesn't include 0 in this 
        int ans = 0;
        int m = arr.length;
        int n = m+1;
        for(int i = 0; i < m;i++){
            ans = ans^arr[i];
        }
        for(int i = 1; i <n+1; i++){
            ans = ans^i;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        findMissingNum(arr);
        missingNumber(arr);
    }    
}
