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
    // TO track size 
    public static int size;

    //Operations on Linked List 
    // 1. add first - O(1) 
    public void addFirst(int data){
        // Step 1 : Create New Node
        Node newNode = new Node(data);
        // As soon as the newNode is created I will increase the size 
        size++;
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
        size++;
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
    // 2. add middle - O(n)
    public void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        // i is to track temp
         int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        // i == index-1 and temp -> prev
        newNode.next = temp.next;
        temp.next = newNode; 
    }
    public static void main(String[] args) {
        OperationsLinkedList ll = new OperationsLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,7);
        System.out.println("Size is "+size);
        ll.print();
    }
}
