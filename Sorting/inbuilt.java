package Sorting;
// import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Arrays;
import java.util.*;

public class Inbuilt {
    public static void main(String[] args) {
        // The collections.reverse order doesn't work on primitive but works on the object of Integer class so therefore we wrote Integer as the datatype 
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        
        // Method no 2 
        // pass array along with starting index and ending index
        // The endingindex is inconclusive
        // Arrays.sort(arr,0,3);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }


        // // Sort in reverse order
        // Arrays.sort(arr, Collections.reverseOrder());
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        Arrays.sort(arr,0,3, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
