package stack;

public class StackUsingLinkedList {
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            // this.next = next;
        }
    }
    public static class LLStack{
        static Node head = null;
        // O(1)
        public static boolean isempty(){
            return head == null;
        }

        // O(1)
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }
        
        // O(1)
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        // O(1)
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.push(7);
        // stack.push(9);
        // stack.push(8);
        
    }
}
