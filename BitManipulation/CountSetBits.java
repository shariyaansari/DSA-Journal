package BitManipulation;

public class CountSetBits {
    public static void CountBits(int num){
        int count = 0;
        while(num>0){
            if((num & 1) == 1){
                count++;
            }
            num = num>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        CountBits(100018467);
    }
}
