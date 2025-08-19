package LinkedList;

class AddTwoNumbers{
    public static class Node{
        int data;
        Node next;
        // Constructor of this class
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
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

    public static void main(String[] args) {
        
        
    }
} 