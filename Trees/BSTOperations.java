
public class BSTOperations {

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

    // Build a binary search tree - insert function in binary tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // case 1 - value less than the root data
        if (val < root.data) {
            // Left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
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

    public static boolean search(Node root, int key) {
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            // search on right side
            return search(root.left, key);
        }
        else{
            // root.val < val so search on the right side
            return search(root.right, key);
        }
        // return false;
    }
    public static Node inorderSuccessr(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        // Apply binary search to fint the node to delete 
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            // voila found the node 
            // Case 1 - it's a lead node 
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2 - single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // case 3 - both children exist
            // Step 1 - find inorder successor 
            Node Is = inorderSuccessr(root.right);
            root.data = Is.data;
            delete(root.right, Is.data);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,3,6,2,4,7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        // inOrder(root);
        // search(root, 1);
        // System.out.println(search(root, 2));
        delete(root, 10);
        inOrder(root);
    }
}
