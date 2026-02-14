

public class MergeSortLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // Step 1 -> Find middle
    public static Node midNode(Node head) {
        Node slow = head;
        // fast = head.next -> to get the left middle node instead of right
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Step 2 -> apply merse sort on left and right half
    public Node Sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find mid
        Node mid = midNode(head);
        // split the ll -> 5->4->3->1->1 => 5->4->3 and 2->1
        Node righthead = mid.next;
        mid.next = null;
        // Now call for leaf half and right half
        Node left = Sort(head); // left
        Node right = Sort(righthead); // right
        return MergeLL(left, right);
    }

    // step 3:- Merge Code
    public static Node MergeLL(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (left != null && right != null) {
            if (left.data > right.data) {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            } else {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public static void printList(Node head){
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
    public static void main(String[] args) {
        MergeSortLL list = new MergeSortLL();

        // Creating custom linked list
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.print("Original: ");
        printList(head);

        head = list.Sort(head);

        System.out.print("Sorted: ");
        printList(head);
    }
}
