
import java.util.ArrayList;

public class LowestCommonAncestors {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundLeft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        // Make a function to get the path where I will pass the Arraylist, n1, n2, root
        // Step 1
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // Step 2 - get the LCA using the path from both the lists
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    // Approach 2 
    public static Node lca2(Node root, int n1, int n2) {
        // Step 1 - compare with root 
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);
        // Case 1 - left = val, right = null
        if (right == null) {
            return left;
        }
        // case 2 - left = null, right = val
        if (left == null) {
            return right;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // Common ancestor will be 2 for these 2
        int n1 = 4;
        int n2 = 7;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);
    }
}
