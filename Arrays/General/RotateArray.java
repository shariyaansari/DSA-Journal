package Arrays.General;

public class RotateArray {
    public static void rotate(int[] arr,int d){
        int temp[] = new int[arr.length];
        int i = 0;
        d = d % arr.length;
        for(int j = d; j < arr.length;j++,i++){
            temp[i] = arr[j];
            System.out.println(temp[i]);
        }
        for(int j =0; j < d;j++){
            
            temp[i++] = arr[j];
            System.out.println(temp[i-1]);
        }
        for(int j =0; j <temp.length;j++){
            arr[j] = temp[j];
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,9,3,1};
        rotate(arr, 9);
    }
}
