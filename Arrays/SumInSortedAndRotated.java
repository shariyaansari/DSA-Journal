// https://www.geeksforgeeks.org/problems/pair-sum-in-a-sorted-and-rotated-array/1
package Arrays;
public class SumInSortedAndRotated {
    public static boolean isPresent(int[] arr, int target){
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                // System.out.println(arr[i] + arr[j]);
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    // Using 2 pointers 
    public static boolean isPresentApproach2(int[] arr, int target){
        int n = arr.length;
        // Find index of the smallest element which way we know which part to go on 
        // Left = pivot
        int smallest = Integer.MAX_VALUE;
        int left = 0;
        for(int i = 0 ; i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                smallest = arr[i+1];
                left = i+1;
            }
        }
        int right = (left-1+n)%n;
        
        while(left != right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            }
            if(sum > target){
                // Sum > target so i need a smaller number so therefore move backwards from right
                right = (right-1+n)%n;
            }
            else{
                // Sum < target 
                // I need a greater number so move left forward circularly
                left = (left+1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,9,1,1,1};
        // System.out.println(isPresent(arr, 6));
        System.out.println(isPresentApproach2(arr, 16));
    }
}