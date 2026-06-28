package binary_search;

class KthMissingNo {

    public static int findKthPositive(int[] arr, int k) {
        int CN = 1;
        int MS = 0;
        int idx = 0;
        while (MS <= k) {
            if (MS == k) {
                return CN - 1;
            }

            if (idx < arr.length && arr[idx] == CN) {
                CN++;
                idx++;
            } else {
                CN++;
                MS++;
            }

        }
        return CN - 1;
    }

    public static int findKthPositiveOptimized(int[] arr, int k) {
        int currentNo = 1;
        int MS = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int MissingCount = arr[mid] - (mid + 1);
            if (MissingCount < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Missing = arr[i] - (i+1);
        // arr[end]+k-(arr[end] - (end+1));
        // Open the brackets -> arr[end] + k - arr[end] + (end+1)
        // k + end + 1 
        // also -> start = end + 1
        // so k + start is also valid 
        return k + end + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
    }
}
