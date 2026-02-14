package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {    // 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(16);
        list.add(8);
        // Use a class named Collections (Emphasis on 's' at the end)
        Collections.sort(list); //Ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
