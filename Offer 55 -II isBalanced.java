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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

        if(Math.abs(depth(root.right) - depth(root.left)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root)
    {
        if(root == null)
            return 0;

        return 1 + Math.max(depth(root.right), depth(root.left));
    }
}
