import java.util.*;

class RemoveKDigit{
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        
        int t = k;
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            while(!s.isEmpty() && t > 0 && s.peek() -'0' > ch - '0'){
                s.pop();
                t--;
            }
            s.push(ch);
        }
        while( t != 0){
            s.pop();
            t--;
        }

        // check if stack empty -> no other left
        if(s.isEmpty()){
            return "0";
        }
        
        // String builder to get the ans as the string
        StringBuilder sb = new StringBuilder();
        
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        
        // Remove leading eroes
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }    
}