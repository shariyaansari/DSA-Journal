// https://leetcode.com/problems/pascals-triangle/description/
package Sorting;
// Has time complexity - O(n^2)
public class BubbleSort {
    public static void sorting(int arr[]){
        int swap = 0;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            // swap = 0;
            // n-1-i = if n = 6 and i = 1 then we will only need to peform swap on the first 5 elements cause swap targets first and next conscutive elements 
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // Just to count the number of swaps it took to completely sort the array
                    swap++;
                }
            }
        }
        // This is for my convinience to print the array and the no of swaps it took to sort the array completely
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
