package BinarySearch;

public class RotatedBs {
    // Will not work for duplicate values 
    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length -1; 
        while(start <= end){
            int mid = (start+end)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
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
        return -1;
    }
    public static int binarySearch(int Sortedarr[], int target, int start,int end){
        // System.out.println(end + " "+ mid); 
        while (start <= end) {
            int mid = (start+end)/2;

            if (Sortedarr[mid] == target){
                return mid;
            }
            // right
            if(Sortedarr[mid] < target){
                start = mid + 1;
            }
            // Left
            else{
                end = mid -1;
            }
        }
        return -1; 
    }

    public static int returnIndex(int arr[],int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            // do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found
        else if(arr[pivot] == target){
            return pivot;
        }
        else if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,2};
    
        System.out.println(returnIndex(arr, 4));
    }   
}
