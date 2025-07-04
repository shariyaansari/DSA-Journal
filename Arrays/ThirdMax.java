package Arrays;
import java.util.*;
import java.util.Arrays;

public class ThirdMax {
    public static int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if(n < 3){
            return arr[n-1];
        }
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 -i];
            arr[n - 1 -i] = temp;
        }
        int count = 1;
        int prevElem = arr[0];
        for(int i = 1; i < n;i++){
            if(arr[i] != arr[i-1]){
                count++;
                if(count == 3){
                    return arr[i];
                }
            }
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {11,2,5,5,9};
        thirdMax(arr);
    }
}
