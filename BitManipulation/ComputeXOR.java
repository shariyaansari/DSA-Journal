package BitManipulation;

public class ComputeXOR {
    public static int XOR(int n){
        if(n % 4 == 0 ){
            return (n);
        }
        if(n%4 == 1){
            return (1);
        }
        if(n % 4 == 2){
            return (n+1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(XOR(10));
        // XOR(4);
    }
}
