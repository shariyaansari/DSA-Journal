// https://leetcode.com/problems/maximum-length-of-pair-chain/
package greedy;


import java.util.*;

public class MaxLengthChainPair {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int last = pairs[0][1];
        int count = 1;
        for(int i = 1; i < pairs.length; i++){
            System.out.println(pairs[i][0]+", "+ pairs[i][1]);
            if(pairs[i][0] > last){
                count++;
                last = pairs[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{2,3},{3,4}};    
    }
}
