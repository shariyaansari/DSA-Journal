package Arrays.ArrayList;

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(6);
        list.add(8);
        int max = Integer.MIN_VALUE;
        // O(n)
        for(int i = 0; i < list.size();i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }    
}
