package binary_search;

public class MinimumBouquest {

    public static boolean helper(int[] bloomDay, int currDay, int m, int k) {
        int count = 0;
        int bouquet = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (currDay >= bloomDay[i]) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                bouquet++;
                count = 0;
            }
        }
        // if(bouquet >= m){
        //     return currDay;
        // }
        return bouquet >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int maxD = bloomDay[0];
        for (int i = 1; i < bloomDay.length; i++) {
            maxD = Math.max(bloomDay[i], maxD);
        }
        int start = 1;
        int end = maxD;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (helper(bloomDay, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        
    }

}
