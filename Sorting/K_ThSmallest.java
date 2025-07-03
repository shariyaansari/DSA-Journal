package Sorting;

public class K_ThSmallest {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        kthSmallest(arr, 0);    
    }
}
