package hashmap;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(2);
        System.out.println(hs);
        System.out.println(hs.contains(4));
        // hs.remove(2);

        // Iterations on hashset 
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
