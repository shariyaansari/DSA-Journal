package Sorting;
// Counting sort can have many numbers in quantity but it's range should be smaller
public class Counting {
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sort(int[] arr){
        // Step 1 - get largest 
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        // Make a count array with the size = largest+1 to adjest index
        // Frequency count = iterate on Original Array
        int[] count = new int[largest+1];
        for(int i = 0; i < arr.length;i++){
            count[arr[i]]++;
        }  
        
        // Sorting - here we will iterate on our count array 
        int j = 0; //to update elements
        for(int i = 0; i < count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3};
        sort(arr);
        printArr(arr);
    }
}
