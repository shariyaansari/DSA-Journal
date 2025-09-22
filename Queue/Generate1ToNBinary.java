package Queue;

public class Generate1ToNBinary {
    public static void bin(int n){
        // Divide by 2 until n != 0
        int bin = 0;
        int power = 0;
        while (n > 0){
            int rem = n % 2;
            bin = (int)(bin + (rem * Math.pow(10, power)));
            power++;
            n /= 2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        int n = 2;
        for(int i = 1; i <= 2; i++){
            bin(i);
        }
    }
}
