import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        Integer[] nodes = transNodeToArray(head);
        return buildTreeNode(nodes, 0, nodes.length - 1);
    }

    private TreeNode buildTreeNode(Integer[] nodes, int begin, int end) {
        //注意这里没有=
        if (end - begin < 0) {
            return null;
        }
        int mid = begin + (end - begin) / 2;
        TreeNode tempNode = new TreeNode(nodes[mid]);
        tempNode.left = buildTreeNode(nodes, begin, mid - 1);
        tempNode.right = buildTreeNode(nodes, mid + 1, end);
        return tempNode;
    }

    private Integer[] transNodeToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return list.toArray(new Integer[0]);

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
