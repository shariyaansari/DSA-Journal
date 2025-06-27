// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInteger {
    public static void brute(int arr[], int k ){
        for(int i = 0; i < (arr.length - k + 1); i++) {
            boolean flag = false;
            // Look for first negative number in current window
            for(int j = 0; j < k; j++) {
                if(arr[i + j] < 0) {
                    System.out.print(arr[i + j] + " ");
                    flag = true;
                    break;
                }
            }
            
            // If no negative number found in window
            if(!flag) {
                System.out.print("0 ");
            }
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        int nums[] = {2,-1,-7,8,-15,30,16,28};
        brute(nums, 2);   
    }
}
