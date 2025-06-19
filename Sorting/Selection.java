package Sorting;

public class Selection {
    public static void sorting(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int minpos = i;
            for(int j = i+1; j < n  ; j++){
                if( arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sorting(arr);
    }
}
