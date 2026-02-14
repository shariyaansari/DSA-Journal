

public class SearchRecursive {
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

    // Recursive Function
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public static int recursiveSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        
    }
}
