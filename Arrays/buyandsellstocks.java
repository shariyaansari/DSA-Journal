// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1629503928/

package Arrays;

public class buyandsellstocks {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++ ){
            for(int j = i + 1;j < prices.length; j++ ){
                profit = prices[j] - prices[i];
                maxprofit = Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
    public static int maxProfitapproach2(int[] prices) {
        int profit = 0;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i< prices.length; i++){
            if(buyprice < prices[i]){
                profit = prices[i] - buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; 
        System.out.println(maxProfit(prices));
    }
}
