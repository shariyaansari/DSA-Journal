package hashmap;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String newStr = new String(s);
            // Create the new list
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<>());
            }
            // then add the word
            map.get(newStr).add(str);
        }    
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan","bat", "man"};
        System.out.println(groupAnagrams(words));
    }
}
