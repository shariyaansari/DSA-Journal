package Queue;

import java.util.*;

public class InterleaveQueue {
    public static Queue interleave(Queue<Integer> q1) {
        Queue<Integer> firsthalf = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();
        // Storing size of queue 1
        int n = q1.size();
        // Dividing the size of queue in half(Assuming the size is even for the queue )
        int half = n / 2;
        int index = 0;
        while (index < n / 2) {
            firsthalf.add(q1.remove());
            index++;
        }
        System.out.println(q1);
        System.out.println(firsthalf);
        // Storing the first and second half in the new queue 
        while (!q1.isEmpty() && !firsthalf.isEmpty()) {
            res.add(firsthalf.remove());
            res.add(q1.remove());
        }
        System.out.println(res);
        return res;
    }

    // Approach 2
    public static void interleaveApproach2(Queue<Integer> q1) {
        Queue<Integer> firsthalf = new LinkedList<>();
        int n = q1.size();
        int half = n / 2;
        int index = 0;
        while (index < n / 2) {
            firsthalf.add(q1.remove());
            index++;
        }
        // Now take 1 from queue2 and 1 from queue1 
        while(!firsthalf.isEmpty()){
            q1.add(firsthalf.remove());
            q1.add(q1.peek());
            q1.remove();
        }
        System.out.println(q1);
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
        // interleave(q1);
        interleaveApproach2(q1);
        // System.out.println(interleave(q1));
    }
}
