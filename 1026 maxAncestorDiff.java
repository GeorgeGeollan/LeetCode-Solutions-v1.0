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
class Solution1 {
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

class Solution2 {
    int res = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) {
            return 0;
        }

        helper(root, root.val, root.val);

        return res;
    }

    public void helper(TreeNode root, int min, int max) {
        if(root == null) {
            return;
        }

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        if(root.left == null && root.right == null) {
            res = Math.max(res, Math.abs(max - min));
        }

        helper(root.left, min, max);
        helper(root.right, min, max);
    }
}
