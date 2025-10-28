package Greedy;

import java.util.Comparator;
import java.util.*;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int w = 50; 

        // sort 
        double ratio[][] = new double[val.length][2];
        // 0th Col-> index
        // 1st col -> ratio of items 
        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int value = 0;
        // the ratio is sorted in ascending order 
        for(int i = ratio.length-1 ; i >= 0; i--){
            int idx =(int)ratio[i][0];
            if(capacity >= wt[idx]){
                capacity = capacity- wt[idx];
                value += val[idx];
            }
            else{
                value += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.println(value);
        System.out.println(capacity);
    }
    
}
