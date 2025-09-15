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
    public boolean isPalindrome(Node head){
        Node temp = head;
        int size = 0;  
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // get middle of stack
        int mid = size/2;
        
        // make new stack
        Stack<Integer> res = new Stack();

        // initialize index
        int index = 0;

        // initialize curr as head
        Node curr = head;

        // Traverse until the middle of the element and push into stack 
        while(index < mid){
            int data = curr.data;
            res.push(data);
            curr = curr.next;
            index++;
        }

        // For odd sized linked list - no need to compare the middle element just skip it 
        if (size % 2 != 0) {
            curr = curr.next; // skip the middle node
        }

        // Go to the next half of the linked list
        while(curr != null){
            // check the top of the stack and if they are not same return false as the no is not palindrome
            if(!res.empty() && curr.data != res.peek()){
                return false;
            }
            // if the elements are same then pop and compare the next element
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
