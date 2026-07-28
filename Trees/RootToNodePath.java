import java.util.*;

class RootToNodePath{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            // this.left = null;
            // this.right = null;
        }
    }
    public static boolean getPath(TreeNode root, int target, List<Integer> res){
        if(root == null){
            return false;
        }
        res.add(root.val);

        if(root.val == target){
            return true;
        }
        
        if(getPath(root.left, target, res) || getPath(root.right, target, res)){
            return true;
        }

            res.remove(res.size()-1);
        return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        List<Integer> res = new ArrayList<>();
        getPath(root, 7, res);
        System.out.println(res);

    }
}