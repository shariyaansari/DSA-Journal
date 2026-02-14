package Queue;

public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1; 
            front = -1; 
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Adding first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
            // return data;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is full");
                return -1;
            }
            int val = arr[front];
            // When deleting the last element then we need to put front and rear back to -1 
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
