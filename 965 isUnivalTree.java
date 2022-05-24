/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int judge;
    public boolean isUnivalTree(TreeNode root) {
        judge = root.val;

        return dfs(root);
    }

    public boolean dfs(TreeNode root) {
        if(root == null)
            return true;

        if(judge != root.val)
            return false;

        return dfs(root.left) && dfs(root.right);
    }
}
