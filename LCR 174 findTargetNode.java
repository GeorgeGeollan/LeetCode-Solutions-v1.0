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
    public int findTargetNode(TreeNode root, int cnt) {
        List<Integer> ans = new ArrayList<>();

        dfs(ans, root);

        return ans.get(ans.size() - cnt);
    }

    public void dfs(List<Integer> ans, TreeNode root) {
        if(root == null) {
            return;
        }
    
        dfs(ans, root.left);
        ans.add(root.val);
        dfs(ans, root.right);
    }
}
