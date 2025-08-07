package LinkedList;

public class CycleInLinkedList {
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
    public static boolean hasCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // CycleInLinkedList ll = new CycleInLinkedList();
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(7);
        // ll.addFirst(2);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = head;
        // 1->2->2->1

        System.out.println(hasCycle());
    }
}
