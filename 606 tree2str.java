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
    String ans;
    public String tree2str(TreeNode root) {
        ans = "";
        dfs(root);

        return ans;
    }
    
    public void dfs(TreeNode root) {
        if(root == null)
            return;

        ans += root.val;
        if(root.left != null) {
            ans += "(";
            dfs(root.left);
            ans += ")";
        }

        if(root.right != null) {
            if(root.left == null)
                ans += "()";
            ans += "(";
            dfs(root.right);
            ans += ")";
        }
        
    }
}
