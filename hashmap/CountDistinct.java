package hashmap;

import java.util.HashSet;

public class CountDistinct {
    public static int count(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i: arr){
            hs.add(i);
        }
        System.out.println(hs);
        return hs.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        
        System.out.println(count(arr));
    }

}
