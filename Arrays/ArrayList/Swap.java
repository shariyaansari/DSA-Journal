package Arrays.ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(16);
        list.add(8);
        int ind = 1, ind2 = 3;
        System.out.println(list);
        swap(list, ind, ind2);
        System.out.println(list);
    }
}
