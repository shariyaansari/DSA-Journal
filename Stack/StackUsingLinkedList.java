package Stack;

public class StackUsingLinkedList {
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    static class LLStack{
        static Node head = null;
        public static boolean isempty(){
            if(head == null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.push(7);
        stack.push(9);
        stack.push(8);
        
    }
}
