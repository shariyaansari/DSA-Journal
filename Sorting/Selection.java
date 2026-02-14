package Sorting;
// This is more efficient than bubble sort but has the same complexity as bubble sort 0(n^2)
public class Selection {
    public static void sorting(int[] arr){
        // Find the smallest for bringing it to the front
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            // Set the min pos as the starting index
            int minpos = i;
            for(int j = i+1; j < n  ; j++){
                // Check if there is any other element smaller than the min pos if yes then update the min pos
                if( arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            // When finally smallest pos obtained then swap 
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        // This is for my convinience 
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sorting(arr);
    }
}