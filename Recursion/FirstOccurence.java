package recursion;

public class FirstOccurence {
    public static int firstOcc(int arr[], int key,int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return firstOcc(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5};
        System.out.println(firstOcc(arr, 5, 1));
    }
}
