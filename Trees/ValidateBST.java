
import java.util.ArrayList;
import java.util.List;

public class ValidateBST {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        for (int i = 0; i < result.size() - 1; i++) {
            int prev = result.get(i);
            int curr = result.get(i + 1);
            if (curr <= prev) {
                return false;
            }
        }
        return true;
    }
    // Approach 2 - Using Range
    public static boolean isValid(TreeNode root, TreeNode min, TreeNode max){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min.val){
            return false;
        }   
        else if(max != null && root.val >= max.val){
            return false;
        }
        return isValid(root.left, min, root)&& isValid(root.right, root, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(14);
        System.out.println(isValid(root, null, null));
    }
}
