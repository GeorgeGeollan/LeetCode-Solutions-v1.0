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
    int ans = 0;
    
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        
        return ans;
    }
    
    public void dfs(TreeNode root, int preMax, int preMin) {
        if(root == null)
            return;
        
        ans = Math.max(ans, Math.max(Math.abs(preMax - root.val), Math.abs(root.val - preMin)));
        
        dfs(root.left, Math.max(preMax, root.val), Math.min(preMin, root.val));
        dfs(root.right, Math.max(preMax, root.val), Math.min(preMin, root.val));
        
    }
}
