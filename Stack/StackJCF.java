package Stack;
import java.util.*;

public class StackJCF {    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(3);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
    }    
}
