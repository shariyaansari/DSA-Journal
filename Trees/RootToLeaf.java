package Trees;
import java.util.*;
public class RootToLeaf {
    static class Node{
        int data;
        Node left; 
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("N");
    }
    public static void path(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        // Base case 
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        // Step1 - add the current node to the path
        // Step 2 - call for left subtree
        path(root.left, path);
        // step 3 - call for right subtree
        path(root.right, path);
        // Now backtrack 
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        path(root, new ArrayList<>());

    }
}
