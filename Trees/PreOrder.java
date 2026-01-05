import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PreOrder {
    // Class for Node
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

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            // When There is null so no need for left and right child so we can directly
            // return null
            if (nodes[index] == -1) {
                System.out.println("Returning null now");
                return null;
            }
            // If node is not -1 then make a new Node
            Node newNode = new Node(nodes[index]);
            System.out.println("1.Going in with " + nodes[index]);
            newNode.left = buildTree(nodes);
            System.out.println("2.Going in with " + nodes[index]);
            newNode.right = buildTree(nodes);
            System.out.println("3.Going in with " + nodes[index]);

            return newNode;
        }

        // Pre order traversal for the tree
        public static void preorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.data);
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data);
                    if(curr.left != null ){
                        q.add(curr.left);
                    }
                    if(curr.right != null ){
                        q.add(curr.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // Let's make a new tree
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.right.data);
        // System.out.println(root.right.right.data);

        // The printing can be done using preorder() function
        tree.preorder(root);
        tree.levelorder(root);
        tree.inorder(root);
    }
}
