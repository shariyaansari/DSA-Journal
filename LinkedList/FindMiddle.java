// https://leetcode.com/problems/middle-of-the-linked-list/


public class FindMiddle {
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
    // Slow Fast approach
    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }
    public static void main(String[] args) {
        FindMiddle LL = new FindMiddle();
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
        // LL.print();
        LL.mid(head);
    }
}
