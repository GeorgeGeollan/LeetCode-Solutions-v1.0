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
    int ans;
    public int sumRootToLeaf(TreeNode root) {
        ans = 0;

        dfs(root, 0);

        return ans;
    }

    public void dfs(TreeNode root, int prev) {
        if(root == null)
            return;

        prev = prev * 2 + root.val;
        if(root.left == null && root.right == null) {
            ans += prev;
            return;
        }

        
        dfs(root.left, prev);
        dfs(root.right, prev);
    }
}
