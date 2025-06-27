package BinarySearch;

public class OrderAgnostic {
    public static int search(int arr[],int target){
        int start = 0; 
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        // System.out.println(isAsc);
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(search(arr, 1));
    }
}
