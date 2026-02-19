package Greedy;

import java.util.*;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int count = 0;
        for(int i = coins.length-1; i >= 0; i--){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count++;
                    amount = amount - coins[i];
                }
            }
        }
        if(amount != 0){
            return -1;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }    
}
