// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package BinarySearch;

public class containsDuplicateInRotated {
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
            // if elements at start, end and middle are equal then we skip those 
            // but what if those elements are pivot
            if(arr[mid] == arr[start] && arr[start] == arr[end]){
                // Skip the duplicates
                // But what if those elements are pivot then what ? 
                // Check is the start / end is pivot 
                // Start will be pivot if it's next element is smaller than the start
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // Otherwise we know that the left side is sorted and the pivot is on the right
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
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
        int arr[] = {2,9,2,2,2};
    
        System.out.println(returnIndex(arr, 9));
    }   
}
