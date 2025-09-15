package Queue;
import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args) {
        // Queue is an interfacer in java so therefore we cannot directly make it to object 
        // Queue can be make through linkedList and ArrayDeque
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
            
        }
    }    
}
