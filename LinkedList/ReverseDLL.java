

public class ReverseDLL {
    public class Node{
        int data;
        Node next; 
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void reverse(){
        Node curr = head;
        Node prevOfCurr = null;
        Node nextOfCurr;
        while( curr != null){
            nextOfCurr = curr.next;
            curr.next = prevOfCurr;
            curr.prev = nextOfCurr; 
            prevOfCurr = curr;
            curr = nextOfCurr;
        }
        head = prevOfCurr;
    } 
    public static void main(String[] args) {
        ReverseDLL RDLL = new ReverseDLL();
        RDLL.addFirst(6);
        RDLL.addFirst(5);
        RDLL.addFirst(4);
        RDLL.addFirst(3);
        RDLL.addFirst(2);
        RDLL.addFirst(1);
        RDLL.print();
        RDLL.reverse();
        RDLL.print();
    }
}
