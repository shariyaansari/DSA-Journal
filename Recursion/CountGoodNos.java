package recursion;

public class CountGoodNos {
    public static long power(long x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        long halfPowerPos = power(x, n / 2);
        long halfPowerSquared = halfPowerPos * halfPowerPos;
        if (n % 2 != 0) {
            halfPowerSquared = x * halfPowerSquared;
        }
        return halfPowerSquared % 1000000007;
    }

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = (n) / 2;
        long part1 = power(5, even);
        long part2 = power(4, odd);

        return (int) ((part1 * part2) % 1000000007);
    }
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));    
    }
}
