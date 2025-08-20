package LinkedList;

import java.util.List;

class AddTwoNumbers{
    public static class Node{
        int val;
        Node next;
        // Constructor of this class
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public Node addFirst(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;
        int sum = 0;
        int carry = 0;
        while(l1 != null || l2 != null){
            sum = (l1 == null ? 0: l1.val) + (l2 == null ? 0: l2.val) + carry;
            int newdigit = sum %10;
            carry = sum/10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            curr.next = new Node(newdigit);
            curr = curr.next;
        }
        if(carry > 0){
            curr.next = new Node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        
        
    }
} 