package stack;

import java.util.ArrayList;
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
            if (iprevhigh.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - iprevhigh.peek();
            }
            iprevhigh.push(i);
        }
    }


    // Approach 2 
    class Pair {

        int price;
        int ind;

        Pair(int price, int ind) {
            this.price = price;
            this.ind = ind;
        }
    }

    static Stack<Pair> st = new Stack<>();
    int idx = -1;

    public int next(int price) {
        idx += 1;
        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }

        int ans = 0;

        if (st.isEmpty()) {
            ans = idx + 1;
        } else {
            ans = idx - st.peek().ind;
        }

        st.push(new Pair(price, idx));
        return ans;
    }


    // Approach 3
    class StockSpanner {
    class Pair {
        int price;
        int span;

        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }

    static ArrayList<Integer> prices;
    static Stack<Pair> todayP;

    public StockSpanner() {
        prices = new ArrayList<>();
        todayP = new Stack<>();
    }

    public int next(int price) {
        // start with span
        int span = 1;
        
        //check if the top <= curr price, if yes then span += the top.span  
        while (!todayP.isEmpty() && todayP.peek().price <= price) {
            Pair curr = todayP.peek();
            span += curr.span;
            todayP.pop();
        }

        // Then push the curr price with the calc span
        todayP.push(new Pair(price, span));
        return span;
    }
}

    /**
     * Your StockSpanner object will be instantiated and called as such:
     * StockSpanner obj = new StockSpanner();
     * int param_1 = obj.next(price);
     */


    // Approach 4
    static ArrayList<Integer> prices = new ArrayList<>();
    public static int nextApprach4(int price) {
        prices.add(price); 
        // starting yesterday
        int count = 1;
        int i = prices.size() - 2;
        while(i >= 0 && prices.get(i) <= price){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 75, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
