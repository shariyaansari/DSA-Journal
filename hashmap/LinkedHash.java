package hashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India", 100);    
        map.put("Korea", 80);    
        map.put("China", 120);
        System.out.println(map);

        // Treemap 
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("China", 200);
        map2.put("Arab", 200);
        map2.put("USA", 200);
        System.out.println(map2);
    }

}
