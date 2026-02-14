public class Univalued {
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
    public static boolean uniValue(Node root, int value){
        // Base case 
        if(root == null){
            return true;
        }
        if(root.data != value){
            return false;
        }
        boolean left = uniValue(root.left, value);
        boolean right = uniValue(root.right, value);

        if(left != true || right != true){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int data = root.data;
        System.out.println(uniValue(root, data));
    }
}
