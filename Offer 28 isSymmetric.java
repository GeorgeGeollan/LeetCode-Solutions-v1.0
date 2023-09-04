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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return recur(root.left, root.right);
    }

    public boolean recur(TreeNode a, TreeNode b) {
        if(a == null && b == null) {
            return true;
        }

        if(a == null || b == null || (a.val != b.val)) {
            return false;
        }

        return recur(a.right, b.left) && recur(a.left, b.right);
    }
}
