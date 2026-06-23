package binary_search;

public class ShipPackageWithInDays {
    public static boolean helper(int[] weights, int days, int maxcapacity) {
        int currCap = 0;
        int D = 1;
        for (int i = 0; i < weights.length; i++) {
            if ((currCap + weights[i]) <= maxcapacity) {
                currCap = currCap + weights[i];
            } else {
                currCap = weights[i];
                D++;
            }
        }
        return D <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxcapacity = weights[0];
        int sumCapacity = weights[0];
        for (int i = 1; i < weights.length; i++) {
            maxcapacity = Math.max(weights[i], maxcapacity);
            sumCapacity += weights[i];
        }
        //range is from maxCapacity to sumCapacity 
        int start = maxcapacity;
        int end = sumCapacity;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (helper(weights, days, mid)) {
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
