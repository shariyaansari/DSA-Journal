package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LonelyNumber {
    public static List<Integer> findLonely(int[] arr) {
        int max = 0;
        List<Integer> res = new ArrayList();
        if(arr.length == 1){
            res.add(arr[0]);
            return res;
        }
        for(int i = 0; i < arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max+1];
        for(int num : arr){
            count[num]++;
        }
        
        for(int i = 0; i <= max;i++){
            if(count[i] == 1){
                if(i == 0 && count[i+1] == 0){
                    res.add(i);
                }
                if(i > 0 && i < max && count[i-1] == 0 && count[i+1] == 0){
                    res.add(i);
                }
                if(i == max && (count[i-1] == 0)){
                    res.add(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,6,8};
        System.out.println(findLonely(arr));
    }
}
