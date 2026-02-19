package LinkedList;

public class DoublyLinkedList {
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
    public static int size = 0;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public void removefirst(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        if(size == 1){
            head = null;
            size--;
            return;
        }
        size--; 
        head = head.next;
        head.prev = null;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void removeLast(){
        Node temp = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        if(size == 1){
            head = null;
            return;
        }
        int index = 0;
        while(index < size-2){
            temp = temp.next;
            index++;
        }
        size--;
        tail = temp;
        temp.next = null;
    }
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.addFirst(3);
        DLL.addFirst(4);
        DLL.addFirst(8);
        DLL.addlast(2);
        DLL.print();
        // DLL.removefirst();
        DLL.removeLast();
        DLL.print();
        // System.out.println(size);
    }
}
