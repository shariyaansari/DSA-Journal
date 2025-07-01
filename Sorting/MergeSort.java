package Sorting;

public class MergeSort {
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sort(int[] nums, int start, int end){
        if(start >= end){
            // Only 1 element left in the array that is itself sorted so directly return.
            return;
        }
        int mid = start + (end-start)/2;
        // Now get the left part 
        sort(nums, start, mid);
        // Now to get the right part 
        sort(nums, mid+1, end);
        merge(nums,start,mid,end);
    }
    public static void merge(int[] nums, int start, int mid, int end){
        // left(0,3)=4 elements right(4,6)=3 elements so total -7 elements 
        // 6-0+1 = 7
        int[] temp = new int[end - start + 1];
        // Making an iterator to interate through left array elements
        int i = start;
        // For right side iterator 
        int j = mid+1;
        // Iterator for temporary array
        int k = 0;
        while(i <= mid && j <= end){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                k++; i++;
            }else{
                temp[k] = nums[j];
                k++; j++;
            }
        }
        // Since there is & condition so my left part or right part might have some elements left 
        while(i <= mid){
            temp[k] = nums[i];
            k++;
            i++;
        }
        while(j <= end){
            temp[k] = nums[j];
            j++;
            k++;
        }
        // Copy temporary to my original array 
        for(k = 0,i = start ; k < temp.length;k++,i++){
            nums[i] = temp[k]; 
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
