// http://leetcode.com/problems/reconstruct-itinerary/description/
package hashmap;
import java.util.*;

public class findItenary {

    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> reversed = new HashMap<>();
        for(int i = 0; i < tickets.size();i++){
           map.put(tickets.get(i).get(0), tickets.get(i).get(1));
        }
        for(int i = 0; i < tickets.size();i++){
           reversed.put(tickets.get(i).get(1), tickets.get(i).get(0));
        }
        String start = "";
        for(String str : map.keySet()){
            if(!reversed.containsKey(str)){
                start = str;
            }
        }
        List<String> res = new ArrayList<>();
        res.add(start);
        
    
        while(map.containsKey(start)){
            String next = map.get(start);
            res.add(next);
            start = next;
        }

        System.out.println(map);
        System.out.println(reversed);
        System.out.println(start);
        return res;
    }
    public static void main(String[] args) {
        String[][] tickets ={{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}};
        HashMap<String, String> res = new HashMap<>();
        for(int i = 0; i < tickets.length;i++){
           res.put(tickets[i][0], tickets[i][1]);
        }
    }   
}
