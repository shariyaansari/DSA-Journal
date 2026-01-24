public class PrintInRange {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Make a bst 
    public static Node insert(Node root, int val){
        // Edge case 
        if(root == null){
            // Create a new node 
            root = new Node(val);
            return root;
        }
        if(val > root.data){
            root.right = insert(root.right, val);
        }
        else{
            root.left = insert(root.left, val);
        }
        return root;
    }
    
     public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        // Case 1 - root in in between the elements
        if(root.data > k1 && root.data < k2){
            System.out.println(root.data);
            printInRange(root.left, k1, k2);
            printInRange(root.right, k1, k2);
        }
        else if(root.data == k1){
            printInRange(root.right, k1, k2);
        }
        else if(root.data == k2){
            printInRange(root.left, k1, k2);
        }


    }
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,1,4,14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        // inOrder(root);
        // int sum = 0;
        printInRange(root, 5, 12);
    }
}
