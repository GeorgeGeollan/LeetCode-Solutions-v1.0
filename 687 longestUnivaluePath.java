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
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);

        return max;
    }

    public int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = dfs(root.left), right = dfs(root.right);
        int left1 = 0, right1= 0;

        if(root.left != null && root.val == root.left.val) {
            left1 = left + 1;
        }

        if(root.right != null && root.val == root.right.val) {
            right1 = right + 1;
        }

        max = Math.max(max, left1 + right1);

        return Math.max(right1, left1);
    }
}
