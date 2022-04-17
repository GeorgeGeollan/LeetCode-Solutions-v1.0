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
    List<TreeNode> list = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        
        for(TreeNode node: list) {
            cur.right = node;
            cur.left = null;
            cur = cur.right;
        }
        
        return dummy.right;
        
    }
    
    public void dfs(TreeNode root) {
        if(root == null)
            return;
    
        
        dfs(root.left);
        list.add(root);
        dfs(root.right);
        

    }
}
