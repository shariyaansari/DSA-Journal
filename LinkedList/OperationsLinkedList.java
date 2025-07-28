package LinkedList;

public class OperationsLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //Operations on Linked List 
    // 1. add first - O(1) 
    public void addFirst(int data){
        // Step 1 : Create New Node
        Node newNode = new Node(data);
        // If my linked list is empty
        if(head == null){
            head = tail = newNode; 
            return;               
        }
        // Step 2 - Assign head address value to the next of newNode 
        // Linking step 
        newNode.next = head;
        //  head = newNode 
        head = newNode;
    }

    // 2. add last - O(1)
    public void addLast(int data){
        // Step 1 : Create New Node
        Node newNode = new Node(data);
        // If my linked list is empty
        if(head == null){
            head = tail = newNode; 
            return;                
        }
        // Step 2 - Linking
        tail.next = newNode;
        // Step 3 - update the last 
        tail = newNode;
    }

    // 3.Print LL
    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        OperationsLinkedList ll = new OperationsLinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
