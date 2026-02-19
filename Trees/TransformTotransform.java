package Trees;
public class TransformTotransform {
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
    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild= transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        root.data = leftChild  + rightChild;
                
        return data+leftChild+rightChild;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transform(root);
        preOrder(root);
    }    
}
