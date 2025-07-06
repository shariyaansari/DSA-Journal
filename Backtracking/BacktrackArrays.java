package Backtracking;

public class BacktrackArrays {
    public static void changeArr(int[] arr, int index,int value){
        // base case
        if(index == arr.length){
            printArr(arr);
            return;
        }
        // Kaam 
        arr[index] = value;
        changeArr(arr, index+1, value+1);
        arr[index] -= 2;   //Backtracking step
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        // printArr(arr);
    }
}
