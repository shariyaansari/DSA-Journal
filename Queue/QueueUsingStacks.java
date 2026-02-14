package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        // =============== Using push ===========
        public static void add(int data) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {            
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            return s1.peek();
        }

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // ======== Using POP =================
        public static void addUsingPop(int data){
            // Directly push into s1 
            s1.push(data);
        }
        public static int removeUsingPop(){
            if (isEmpty()) return -1;
            // to pop if s2 is empty then push all elements from s1 to s2
            if (s2.isEmpty()) {
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            // then return the top 
            return s2.pop();
        }
        public static int peekUsingPop(){
            if (isEmpty()) return -1;
            // to pop if s2 is empty then push all elements from s1 to s2
            if (s2.isEmpty()) {
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            // then return the top 
            return s2.peek();
        }
    }


    public static void main(String[] args) {
        // Queue q = new Queue();
        // q.add(3);
        // q.add(6);
        // q.add(5);
        // while (!q.isEmpty()) {
        //     System.out.print(q.peek());
        //     q.remove();
        // }
        System.out.println();
        Queue q2 = new Queue();
        q2.addUsingPop(3);
        q2.addUsingPop(6);
        q2.addUsingPop(5);
        while (!q2.isEmpty()) {
            System.out.println(q2.peekUsingPop());
            q2.removeUsingPop();
        }
    }
}
