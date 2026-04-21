// https://leetcode.com/problems/valid-parenthesis-string/submissions/1984820491/
package greedy;

public class ValidParenthesis {
    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        if(s.charAt(0) == ')'){
            return false; 
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                min++;
                max++;
            }
            if (ch == ')') {
                min--;
                max--;
            }
            if (ch == '*') {
                min--;

                max++;
            }
            if (min < 0) {
                min = 0;
            }
            if(max < 0){
                return false;
            }
        }
        return (min == 0);
    }    
    public static void main(String[] args) {
        String s = "*(";
        System.out.println(checkValidString(s));    
    }
}
