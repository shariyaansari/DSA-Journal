package BitManipulation;

public class CountNos {
    public static void count(int n) {
        int x = 0;
        int count = 0;
        while (x <= n) {
            if ((n + x ) == (n ^ x)) {
                count++;
            }
            x++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        count(4);
    }
}
