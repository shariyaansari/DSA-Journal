package LinkedList;

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
    public boolean isPalindrome(){
        // Size of of linked list 
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int[] array = new int[size];
        Node traverse = head;
        
        while(traverse != null){
            int index = 0;
            array[index++] = traverse.data;
            traverse = traverse.next;
        }
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            if(array[left] != array[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 2 

    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.data);
        return slow;
    }

    public boolean isPalindromeApproach2(){
        // Step 1 : find mid 
        // step 2: reverse 2nd half
        // Step 3: equate left and right 
        
        // Base/edge cases 
        if(head == null || head.next == null){
            return true;
        }
        // step 1
        Node midNode = mid(head);

        // Step 2 - reverse LL
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3 
        Node right = prev; // start of right half
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome linkedList = new Palindrome();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.print();
        boolean ans = linkedList.isPalindromeApproach2();
        System.out.println(ans);
    }
}
