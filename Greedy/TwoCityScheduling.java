package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        Arrays.sort(costs, Comparator.comparingInt(o -> o[0] - o[1]));
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
        int[][] costs = new int[][]{{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(costs));
    }
}
