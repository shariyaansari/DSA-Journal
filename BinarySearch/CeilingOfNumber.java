// https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1
// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
package BinarySearch;

public class CeilingOfNumber {
    public static int findCeil(int[] arr, int x) {
        // code here
        int start = 0;
        int end = arr.length-1;
        if(x > arr[arr.length-1]){
            return -1;
        }
        while(start <= end){
            int mid = (start+end)/2;
            if((arr[mid] == x)){
                return arr[mid];
            }
            // right
            if(arr[mid] < x){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return arr[start];
    }
    
    public static int findfloor(int[] arr, int x) {
        // code here
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if((arr[mid] == x)){
                return arr[mid];
            }
            // right
            if(arr[mid] < x){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(findCeil(arr,15));
        System.out.println(findfloor(arr,15));

    }
}
