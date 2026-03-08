package recursion;
// Print Binary String of size n without consecutive ones
public class BinaryStrings {
    static int call;
    public static void printBinaryStrings(int n, int lastPlace,String str){
        // LastPlace is to decide whether we want 1 or 0 
        // if Lp = 0 then we can use 0 or 1 
        // but if lp = 1 then we can only use 0 since we don't want Consecutive ones
        // Base Case
        if( n == 0){
            // str.append("");
            System.out.println(str);
            return;
        }
        System.out.println(call++ + "lp0");
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            System.out.println(call++ + "lp1");
            printBinaryStrings(n-1, 1, str+"1");
        }
        
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
