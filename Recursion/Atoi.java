// https://leetcode.com/problems/string-to-integer-atoi/
package recursion;

public class Atoi {
    public static int atoi(String s, int index, int currentNumber, int sign) {
        if (index == s.length() || !Character.isDigit(s.charAt(index))) {
            return currentNumber;
        }
        int digit = s.charAt(index) - '0';
        if ((currentNumber) > (Integer.MAX_VALUE - digit) / 10) {
            return sign == +1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return atoi(s, index + 1, currentNumber * 10 + digit, sign);
    }
    public static int myAtoi(String s) {
            int i = 0;
            int sign = 1;
            while (i < s.length()) {
                char ch = s.charAt(i);
                if (s.charAt(i) == ' ') {
                    i++;
                    continue;
                }

                if (ch == '+' || ch == '-') {
                    sign = (ch == '+') ? 1 : -1;
                    i++;
                    break;
                }
                if (Character.isDigit(ch)) {
                    break;
                }
                if (i >= s.length() || !Character.isDigit(s.charAt(i))){
                    return 0;
                }
            }

            return sign * atoi(s, i, 0, sign);
    }
    public static void main(String[] args) {
        String s = "  -42";
        System.out.println(myAtoi(s));
        
    }    
}
