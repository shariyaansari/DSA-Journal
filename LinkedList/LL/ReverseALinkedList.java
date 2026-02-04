package LL;

public class ReverseALinkedList {
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
    public static void ReverseLinkedList(){
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while(curr != null){
            // Step 1 - set the next node
            next = curr.next;
            // Step 2 - Change the direction of ll from -> to <- 
            // 1->2->3->4->null  ==> 1<-2->3-> 4-> null
            curr.next = prev;
            // Step 3 - change prev 
            prev = curr;
            // Change next 
            curr = next;
        }
    }
    public static void main(String[] args) {
        
    }
}
