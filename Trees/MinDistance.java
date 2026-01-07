public class MinDistance {
    static class Node{
        int data; 
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }
   public static Node lca(Node root, int n1, int n2) {
        // Step 1 - compare with root 
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
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
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int ldist = lcaDist(root.left, n);
        int rdist = lcaDist(root.right, n);
        if(ldist == -1 && rdist == -1){
            return -1;
        }else if(ldist == -1){
            return rdist+1;
        }else{
            return ldist+1;
        }
    }

    public static int minDist(Node root, int n1, int n2){
        // Step 1 - find lca
        Node lca = lca(root, n1, n2);
        // Step 2 - find lca distance 
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        
        return dist1 + dist2;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDist(root, 4, 6));
    }
}
