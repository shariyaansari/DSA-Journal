package binary_search;
class KokoEatingBananas{
    public static boolean Helper(int[] piles, int h, int k) {
        long hr = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % k == 0) {
                hr += piles[i] / k;
            } else {
                hr += (piles[i] / k) + 1;
            }
        }
        if(hr <= h){
            return true;
        }
        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }

        int start = 1;
        int end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (Helper(piles, h, mid)) {
                // ans = mid;
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
