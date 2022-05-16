/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null)
            return null;

        if(root.val <= p.val)
            return inorderSuccessor(root.right, p);

        TreeNode ans = inorderSuccessor(root.left, p);

        return ans == null ? root : ans;
    }
}
