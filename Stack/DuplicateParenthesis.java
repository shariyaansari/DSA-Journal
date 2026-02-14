package Stack;
import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean parentheses(String s){
        Stack<Character> stack = new Stack();
        int count = 0;
        for(int i = 0; i < s.length();i++){
            count = 0;
            char ch = s.charAt(i);
            if(ch != ')'){
                stack.push(ch);
            }
            while(stack.peek() != '('){
                stack.pop();
                count++;
            }
            if(count < 1){
                return true;
            }
            stack.pop();
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s = "(a+b)";    
        System.out.println(parentheses(s));
    }

}
