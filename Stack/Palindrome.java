package Stack;
import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {
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
    public boolean isPalindrome(Node head) {
        Node temp = head;
        int size = 0;  
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int mid = size/2;
        
        Stack<Integer> res = new Stack();

        int index = 0;

        Node curr = head;

        while(index < mid){
            int data = curr.data;
            res.push(data);
            curr = curr.next;
            index++;
        }

        // For odd sized linked list
        if (size % 2 != 0) {
            curr = curr.next; // skip the middle node
        }

        while(curr != null){
            if(!res.empty() && curr.data != res.peek()){
                return false;
            }
            else{
                res.pop();
            }
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
