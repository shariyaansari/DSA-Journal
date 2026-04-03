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

        // 1. Iterations on hashset 
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 2. enhanced for loop
        for(Integer num: hs){
            System.out.println(num);
        }

        // Hashset 
        HashSet<String> hset = new HashSet<>();
        hset.add("India");
        hset.add("Nepal");
        hset.add("China");
        hset.add("US");
        hset.add("UAE");

        LinkedHashSet<String> LHS = new LinkedHashSet<>();
        LHS.add("India");
        LHS.add("Nepal");
        LHS.add("China");
        LHS.add("US");
        LHS.add("UAE");
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Nepal");
        ts.add("China");
        ts.add("US");
        ts.add("UAE");

        System.out.println(hset);
        System.out.println();
        System.out.println(LHS);
        System.out.println();
        System.out.println(ts);


    }
}
