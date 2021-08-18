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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null)
            return count;

        int max = root.val;
        dfs(root, max);

        return count;
    }

    public void dfs(TreeNode root, int max)
    {
        if(root == null)
            return;

        if(max <= root.val)
        {
            max = root.val;
            count++;
        }

        dfs(root.left, max);
        dfs(root.right, max);

    }
}
