package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[], int[] span) {
        Stack<Integer> iprevhigh = new Stack<>();
        // Setting first index as 1 by default
        span[0] = 1;
        // Pushing 1st element's index to stack
        iprevhigh.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!iprevhigh.isEmpty() && currPrice > stocks[iprevhigh.peek()]) {
                iprevhigh.pop();
            }
            if(iprevhigh.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - iprevhigh.peek();   
            }
            iprevhigh.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = { 100, 80, 60, 75, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
