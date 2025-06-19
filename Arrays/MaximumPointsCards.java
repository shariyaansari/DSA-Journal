// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

package Arrays;

public class MaximumPointsCards {
    public static int maxScore(int[] arr, int k) {
        int left = 0; 
        int right = arr.length -1;
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        
        // Find left sum
        for(int i = 0; i < k; i++){
            lsum += arr[i];
            maxSum = Math.max(maxSum,lsum);
        }
        for(int i = k-1; i >=0;i--){
            lsum -= arr[i];
            rsum = rsum + arr[right];
            right--;
            maxSum = Math.max(maxSum,rsum+lsum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,9};
        System.out.println(maxScore(arr, 4));
    }
}
