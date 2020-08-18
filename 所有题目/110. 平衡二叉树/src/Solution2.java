import java.util.Map;

public class Solution2 {
    public boolean isBalanced(TreeNode root) {
        return getHigh(root) != -1;
    }


    private int getHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHigh = getHigh(node.left);
        int rightHigh = getHigh(node.right);
        if (leftHigh == -1 || rightHigh == -1 || Math.abs(leftHigh - rightHigh) > 1) {
            return -1;
        }
        return Math.max(leftHigh, rightHigh) + 1;
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
