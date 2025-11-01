package Greedy;

import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        Arrays.sort(costs, Comparator.comparingDouble(o -> o[0] - o[1]));
        int sum = 0;
        for(int i = 0; i < costs.length; i++){
            if(i < n){
                sum += costs[i][0];
            }else{
                sum += costs[i][1];
            }
        } 
        return sum;
    }
    public static void main(String[] args) {
        int[][] costs = costs = [[10,20],[30,200],[400,50],[30,20]];
        twoCitySchedCost(costs);
    }
}
