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
    List<Integer> list;
    public int minDiffInBST(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        int minVal = 100001;

        for(int i = 0; i < list.size() - 1; i++) {
            minVal = Math.min(minVal, list.get(i + 1) - list.get(i));
        }

        return minVal;
    }

    public void dfs(TreeNode root) {
        if(root == null) {
            return;
        }

        
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
