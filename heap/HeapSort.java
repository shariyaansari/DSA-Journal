package heap;

public class HeapSort {
    public static void heapify(int i, int size, int[] arr){
        int left = 2*i+1; 
        int right = 2*i+2;
        int maxIdx = i; 
        if(left < size && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i]; 
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, size, arr);
        }
    }

    public static void heapSort(int[] arr){
        // step 1 - build maxheap
        int n = arr.length;
        for(int i = n/2; i >= 0; i--){
            heapify(i, n, arr);
        }
        for(int i = n-1; i > 0; i--){
            // Swap first and last
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp;
            heapify(0, i, arr);
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,4,5,3};
        heapSort(arr);

        System.out.println("this file works perfectly");
    }    
}
