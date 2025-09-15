package Queue;

public class Operations {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            // If rear = -1 then queue is empty
            return rear == -1;
        }
        public static void enqueue(int data){
            // first check if queue is full 
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            // first element =  
            int front = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
