package hashmap;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = {1, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i], map.get(nums[i])+1);   
            // }else{
            //     map.put(nums[i], 1);
            // }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        // similarly I don't need to store the ds somewhere
        // Set<Integer> keys = map.keySet();

        for(int key: map.keySet()){
            if(map.get(key) > nums.length/2){
                System.out.println(key);
            }
        }
    }
}
