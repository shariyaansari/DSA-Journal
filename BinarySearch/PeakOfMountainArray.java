// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
package BinarySearch;

public class PeakOfMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        // Will be my peak
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            // [0,1,3,5,4,3,2] - mid = 5 i.e > 4 so therefore the peak is on the left 
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
            // If that's not the case we know ro search on the right
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 0,1,0 };
        System.out.println(peakIndexInMountainArray(arr));
    }
}
