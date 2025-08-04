package LinkedList;

public class DeleteFromNthNode {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Operations of ll - just to add a sample LL 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    // Function to delete from middle
    public void deleteNthFromlast(int n){
        // Calculate size 
        Node temp = head;
        int sz = 0;
        while(temp != null){
            sz++;
            temp = temp.next;
        }
        // Edge case
        if(n == sz){
            // perform remove first 
            head = head.next;
            return;
        }
        // for the rest of the cases we do deletion 
        Node prev = head;
        int i = 1;
        while(i < sz-n){
            // Trying to reach the index of the element that is before the element tp be deleted.
            prev = prev.next;
            i++;
        } 
        // Perform deletion 
        prev.next = prev.next.next;
        // return prev;
    }    
    public void deletefromMiddle(int n){
        // Calculate size 
        Node temp = head;
        int sz = 0;
        while(temp != null){
            sz++;
            temp = temp.next;
        }
        if(size == 1){
            head = null;
            return;
        }
        if(size ==- 2){
            head.next = null;
        }
        // for the rest of the cases we do deletion 
        Node prev = head;
        int i = 0;
        while(i < n-1){
            // Trying to reach the index of the element that is before the element tp be deleted.
            prev = prev.next;
            i++;
        } 
        // Perform deletion 
        prev.next = prev.next.next;
        // return prev;
    }    
    public static void main(String[] args) {
        DeleteFromNthNode linkedList = new DeleteFromNthNode();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        // linkedList.print();
        // linkedList.deleteNthFromlast(4);
        // linkedList.print();
        int deletionIndex;
        if(size % 2 == 0){
            deletionIndex = (size/2)+1;
        }
        deletionIndex = size/2;
        // System.out.println(size);
        linkedList.deletefromMiddle(deletionIndex);
        linkedList.print();
        
    }
}
