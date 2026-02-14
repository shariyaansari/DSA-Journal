

public class CircularLinkedList {
    public class Node{
        int data; 
        Node next;              
        public Node(int data){
            this.data = data;
        }
    }
    public Node addToEmpty(Node last, int data){
        if(last != null){
            return last;
        }   
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        return last; 
    }
}
