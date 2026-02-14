
import java.util.*;

public class TopViewTree {
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
    
    static class Info{
            Node node; 
            int hd;
            Info(Node node, int hd){
                this.node = node;
                this.hd = hd;   
            }
        }
        public static void TopView(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0; 
            int max = 0; 

            q.add(new Info(root, 0));
            // For tracking levels use queue
            q.add(null);
            while(!q.isEmpty()){
                Info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    // Check if the key doesn't already exists in the map 
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd, curr.node);
                    }
                    if(curr.node.left != null){
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }
                    if(curr.node.right != null){
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }  

            for(int i= min; i <= max; i++){
                System.out.println(map.get(i).data);
            }          
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        System.out.println("Top view of the tree is:");
        // Implementation for top view would go here
        TopView(root); 
        
    }
}
