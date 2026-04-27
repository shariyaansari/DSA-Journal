package greedy;
import java.util.*;

public class InfiniteSupplyOfDominators {
    public static void count(int value, int[] arr){
        List<Integer> res = new ArrayList<>();
        while( value != 0){
            for(int i = arr.length-1; i >= 0; i--){
                if(value - arr[i] >= 0){
                    value = value - arr[i];
                    res.add(arr[i]);
                }
            }
        }
        System.out.println(res);
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,50,100,500,1000}; 
        count(121, arr);
    }
}
