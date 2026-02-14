package Arrays.ArrayList;

import java.util.ArrayList;

public class MultiDim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 1; i <= 5;i++){
            list.add(i*1);  //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        // How to print the list using for loop 
        for(int i = 0; i < mainList.size();i++){
            ArrayList<Integer> current = mainList.get(i);
            for(int j = 0; j < current.size();j++){
                System.out.print(current.get(j) + " ");    
            }
            System.out.println();
        }
    }
}
