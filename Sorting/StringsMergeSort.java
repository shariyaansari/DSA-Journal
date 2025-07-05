package Sorting;

public class StringsMergeSort {
    public static void printArr(String[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(String[] arr, int start, int end){
        if(start >= end){
            // Only 1 element left in the array that is itself sorted so directly return.
            return;
        }
        int mid = start + (end-start)/2;
        // Now get the left part 
        sort(arr, start, mid);
        // Now to get the right part 
        sort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(String[] arr, int start, int mid, int end){
        // left(0,3)=4 elements right(4,6)=3 elements so total -7 elements 
        // 6-0+1 = 7
        String[] temp = new String[end - start + 1];
        // Making an iterator to interate through left array elements
        int i = start;
        // For right side iterator 
        int j = mid+1;
        // Iterator for temporary array
        int k = 0;
        while(i <= mid && j <= end){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                k++; i++;
            }else{
                temp[k] = arr[j];
                k++; j++;
            }
        }
        // Since there is & condition so my left part or right part might have some elements left 
        while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        // Copy temporary to my original array 
        for(k = 0,i = start ; k < temp.length;k++,i++){
            arr[i] = temp[k]; 
        }
    }
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury"};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
