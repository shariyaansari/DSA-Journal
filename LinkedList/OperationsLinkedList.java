

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
    // 4. add middle - O(n)
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
    // Delete Operations
    // 5. Delete from start
    public void deletefirst(){
        if(size == 0){
            System.out.println("Nothing to delete");
            // return Integer.MIN_VALUE;
        }
        if(size == 1){
            // so i need to change both head and tail
            // int val = head.data;
            head = tail = null;
            size = 0;
        }
        // int val = head.data;
        head = head.next;
        size--;
    }
    public void deletelast(){
        // Edge cases
        if(size == 0){
            System.out.println("Nothing to delete");
            // return Integer.MIN_VALUE;
        }
        if(size == 1){
            // so i need to change both head and tail
            // int val = head.data;
            head = tail = null;
            size = 0;
        }
        Node prev = head;
        for(int i = 0; i < size-2;i++){
            prev = prev.next;
        }
        // int val = tail.data;
        prev.next = null;
        size--;
        tail = prev;
    }
    
    // Practice Question O(n)
    //Search for a key in linked list and return position where it is found
    public static int iterativeSearch(int key){
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    // Same ques - Recursive Approach TC = O(n)
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public static int recursiveSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        OperationsLinkedList ll = new OperationsLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,7);
        ll.print();
        // ll.deletefirst();
        // // ll.print();
        // ll.deletelast();
        // ll.print();
        // System.out.println("Size is "+size);
        System.out.println(recursiveSearch(7));
        System.out.println(iterativeSearch(7));
    }
}
