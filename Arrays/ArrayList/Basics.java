package Arrays.ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        // list object is created 
        // ClassName ObjectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Operations in ArrayList 
        // Add  O(1)
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(9);
        // Add at index  O(n) 
        list.add(2,19);
        
        System.out.println(list);
        

        // Get  O(1)
        // System.out.println(list.get(2));
        
        // Remove element O(n)
        // list.remove(2);
        // System.out.println(list);
        
        // Set element at index   O(n)
        // list.set(2,10);
        // System.out.println(list);

        // Contains element   O(n)
        // System.out.println(list.contains(12));

        // Size of an ArrayList 
        System.out.println(list.size());

        // To print array list 
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

    }
}
