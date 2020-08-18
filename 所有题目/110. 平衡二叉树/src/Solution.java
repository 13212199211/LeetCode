

public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int abs = Math.abs(getHigh(root.left) - getHigh(root.right));
        return abs <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }


    private int getHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHigh(node.left), getHigh(node.right)) + 1;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
