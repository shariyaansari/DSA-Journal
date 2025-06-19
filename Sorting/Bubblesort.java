package Sorting;

public class Bubblesort {
    public static void sorting(int arr[]){
        int swap = 0;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            // swap = 0;
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("No of times swapping was performed: "+ swap);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5}; 
        sorting(arr);
    }
}
