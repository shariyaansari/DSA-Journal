package arrays.General;

public class CountInversions {

    // public static void approach1(int[] arr){
    //     int count = 0; 
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] > arr[j]) {
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
    // Second approach by using merge sort 
    public static int merge(int[] arr, int start, int end, int mid) {
        int count = 0;
        int left = start;
        int right = mid + 1;
        int[] temp = new int[end - start + 1];
        int k = 0;
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left];
                left++;
            } else {
                temp[k++] = arr[right];
                count += mid - left + 1;
                right++;
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left];
            left++;
        }
        while (right <= end) {
            temp[k++] = arr[right];
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
        return count;
    }

    public static int mergeSort(int[] arr, int start, int end) {
        int cnt = 0;
        if (start >= end) {
            return cnt;
        }
        int mid = (start + end) / 2;
        cnt += mergeSort(arr, start, mid);
        cnt += mergeSort(arr, mid + 1, end);
        cnt += merge(arr, start, end, mid);
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(mergeSort(arr, 0, arr.length - 1));
        
    }

}
