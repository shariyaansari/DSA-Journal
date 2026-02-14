package Sorting;

public class QuickSort {
    public static void printArrr(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end]; 
        
        // This i will make place for elements smaller than pivot
        int i = start-1;

        for(int j = start; j < end ;j++){
            if(arr[j]<= pivot){
                i++;
                // Swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap 
        int temp = pivot;
        arr[end] = arr[i];   // can't use pivot = arr[i] because i want my value to change in original array and not the pivot itself
        arr[i] = temp;
        return i;
    }
    public static void sort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        
        //step 1- find pivot(Taking last element as pivot)
        int pivotIndex = partition(arr, start, end);

        // Left part
        sort(arr, start, pivotIndex-1);
        
        // right part 
        sort(arr, pivotIndex+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        sort(arr, 0, arr.length-1);
        printArrr(arr);
    }    
}
