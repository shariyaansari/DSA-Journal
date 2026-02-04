package LL;

class LinkedList{
    // Node class for making nodes 
    public static class Node{
        int data;
        Node next;
        // Constructor of this class
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Since there will only be 1 head and 1 head I can declare it here only 
    public static Node head; 
    public static Node tail; 
    public static void main(String[] args) {
        // Make an object of Linked list now....I can create all the nodes in this object only noe
        LinkedList ll = new LinkedList();
        // In my linked list a new node ha sbeen created in which my data has been stored 
        ll.head = new Node(1);
        ll.head.next = new Node(2);

        // We will make methods to perform operations on linked list 
    }
}
