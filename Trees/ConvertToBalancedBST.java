
public class ConvertToBalancedBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static TreeNode create_bst(int[] nums, int start, int end){
        if(start > end){
            // System.out.println(start+" "+ end);
            return null;
        }
        int mid = (start+end)/2;
        // System.out.println(mid);
        TreeNode root = new TreeNode(nums[mid]);
        // create left subtree 
        // System.out.println(root.val);
        root.left = create_bst(nums, start, mid-1);
        // create right subtree
        System.out.println(mid+1 +" "+ end);
        root.right = create_bst(nums, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int[] nums = {-10, -3,0, 5,9};
        System.out.println(create_bst(nums, 0, nums.length-1));
        
        
    }
}
