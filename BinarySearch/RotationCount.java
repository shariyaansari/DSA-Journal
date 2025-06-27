package BinarySearch;

public class RotationCount {
    public static int Count(int arr[]){
        int start = 0;
        int end = arr.length -1; 
        boolean isAsc = arr[start] < arr[end];
        if(isAsc){
            return 0;
        }
        while(start <= end){
            int mid = (start+end)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2}; 
        System.out.println(Count(arr));
    }
}
