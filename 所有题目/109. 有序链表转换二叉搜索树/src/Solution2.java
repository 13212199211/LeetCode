public class Solution2 {
    private ListNode globleNode;

    public TreeNode sortedListToBST(ListNode head) {
        globleNode = head;
        return buildTreeNode(0, getLength(head));

    }

    private TreeNode buildTreeNode(int begin, int end) {
        if (begin > end) {
            return null;
        }
        TreeNode tempNode = new TreeNode();
        int mid = begin + (end - begin) / 2;
        tempNode.left = buildTreeNode(begin, mid - 1);
        tempNode.val = globleNode.val;
        globleNode = globleNode.next;
        tempNode.right = buildTreeNode(mid + 1, end);
        return tempNode;
    }

    private int getLength(ListNode head) {
        int num = 0;
        while (head != null) {
            head = head.next;
            num++;
        }
        return num - 1;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
