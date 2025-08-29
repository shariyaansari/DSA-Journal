package Stack;

import java.util.Stack;

public class ValidParentheses {
    // Approach 1 
    public boolean isValid(String s) {
        if(s.length() == 1 || s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
    // Approach 2 
    public static boolean approach2(String s){
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek() == '(' && ch == ')') || (stack.peek() == '[' && ch == ']') || (stack.peek() == '{' && ch == '}')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }    
        return false;
    }
    public static void main(String[] args) {
        
    }
}
