package Stack;

import java.util.Stack;

public class ReverseAString {
    public static void reverse(String s){
        Stack<Character> res = new Stack<>();
        for(int i = 0; i < s.length();i++){
            res.push(s.charAt(i));
        }
        while(res.size() != 0){
            System.out.print(res.pop());
        }
    }
    public static void main(String[] args) {
        reverse("abc");
    }    
}
