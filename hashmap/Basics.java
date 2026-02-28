package hashmap;

import java.util.HashMap;


public class Basics {
    public static void main(String[] args) {
        // to make a hashmap 
        HashMap<String, Integer> hm = new HashMap<>();
        // To perform insert operation 
        // Use put -> O(1)
        hm.put("India", 100);   
        hm.put("China", 150);   
        hm.put("USA", 200);   
        hm.put("Germany", 80); 
        // The line below will update the prev data to current data
        hm.put("India", 120);   

        // Hashmaps are unordered maps so it's not necessary that the same ordered list results -> Order is undefined 
        System.out.println(hm);

        // get -> O(1)
        System.out.println(hm.get("USA"));
        System.out.println(hm.get("USAAAA")); //In this case it returns null value

        // ContainsKey - O(1) -> returns true or false depending upon whether a value exists or not 
        System.out.println(hm.containsKey("India"));   //true
        System.out.println(hm.containsKey("Indifkja")); //false

        // Remove -> O(1) -> pass key as parameter -> deletes the key and returns the value 
        System.out.println(hm.remove("Inda"));
        System.out.println(hm);

        // size()
        System.out.println(hm.size());

        // isEmpty()
        hm.clear(); //empties out the map 
        System.out.println(hm.isEmpty());

    }    
}
