package Recursion;

public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i == 0){
            return -1;
        }
        return lastOcc(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6};
        System.out.println(lastOcc(arr, 5, arr.length-1)); 
    }
    
}
