package Sorting;

public class Insertion {
    public static void sorting(int[] arr){
        // int temp;
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            int curr = arr[i];
            int prev = i - 1;

            // Finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
