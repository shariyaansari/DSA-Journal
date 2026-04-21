// https://leetcode.com/problems/lemonade-change/description/
package greedy;

import java.util.HashMap;

public class LemonadeChange {
     public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.put(bills[i], map.get(bills[i])+1);
            }
            if (bills[i] == 10) {
                if (map.get(5) < 1) {
                    return false;
                }
                map.put(bills[i], map.get(bills[i])+1);
                map.put(5, map.get(5)-1);
            }
            if (bills[i] == 20) {
                map.put(bills[i], map.get(bills[i])+1);
                if (map.get(10) >= 1 && map.get(5) >= 1) {
                    map.put(5, map.get(5)-1);
                    map.put(10, map.get(10)-1);
                } 
                else if(map.get(5) >= 3) {
                    map.put(5, map.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {10,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
