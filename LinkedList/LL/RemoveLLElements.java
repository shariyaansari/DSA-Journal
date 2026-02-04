package LL;

public class RemoveLLElements {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        // just to track the prev and return head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                // delete curr
                prev.next = curr.next;
            } else {
                prev = curr; // move prev only if not deleted
            }
            curr = curr.next; // always move curr
        }

        return dummy.next; // new head
    }

    public static void main(String[] args) {

    }
}
