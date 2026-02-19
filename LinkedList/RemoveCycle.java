package LinkedList;

public class RemoveCycle {
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
    public static boolean hasCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;   //+1 
            fast = fast.next.next;  //+2
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void cycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(3);
        head.next = temp;
        head.next.next = new Node(2);
        head.next.next.next = temp;

        // 1->2->2->1
        System.out.println(hasCycle());
        cycle();
        System.out.println(hasCycle());
    }
}
