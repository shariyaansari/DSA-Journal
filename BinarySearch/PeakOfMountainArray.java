// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
package BinarySearch;

public class PeakOfMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        // Will be my peak
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
            // if(start == efnd){
            // break;
            // }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 0,1,0 };
        System.out.println(peakIndexInMountainArray(arr));
    }
}
