// https://leetcode.com/problems/find-in-mountain-array/description/
package BinarySearch;

public class FindInMountainArray {
    public static int peakofArray(int[] arr) {
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
        }
        return start;
    }

    public static int Bsearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            // right
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // Left
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBS(int arr[], int target, int start, int end) {
    boolean isAsc = arr[start] < arr[end];
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}

    public static int find(int arr[], int target) {
        int peak = peakofArray(arr);
        int firstTry = Bsearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 17, 24, 30, 10, 6, 4 };
        // System.out.println(peakofArray(arr));
        // System.out.println(Bsearch(arr, 2, 0, arr.length-1));
        // System.out.println(orderAgnosticBS(arr, 4, 0, 4));
        System.out.println(find(arr, 4));
    }
}
