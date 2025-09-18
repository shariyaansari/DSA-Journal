package Queue;
import java.util.*;

public class InterleaveQueue {
    public static Queue interleave(Queue<Integer> q1){
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();
        // Storing size of queue 1 
        int n =q1.size();
        // Dividing the size of queue in half(Assuming the size is even for the queue ) 
        int half = n/2;
        int index = 0;
        while(index < n/2){
            q2.add(q1.remove());
            index++;
        }
        System.out.println(q1);
        System.out.println(q2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            res.add(q2.remove());
            res.add(q1.remove());
        }
        System.out.println(res);
        return res;

    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        interleave(q1);
        // System.out.println(interleave(q1));
    }
}
