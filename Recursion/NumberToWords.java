package recursion;

public class NumberToWords {
    static String[] word = {"zero", "one", "two", "three", "four", "five","six","seven","eight","nine"};
    public static void words(String s, int i){
        if(i == s.length()){
            return;
        }
        char ch = s.charAt(i);
        int digit = ch - '0';
        System.out.print(word[digit] + " ");
        words(s, i+1);
    }
    public static void main(String[] args) {
        int number = 2019;
        String str = String.valueOf(number);
        System.out.println(str);
        words(str, 0);
    }
}
