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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(list, root, 0);

        return list;
    }

    public void dfs(List<Integer> list, TreeNode root, int depth)
    {
        if(root == null)
            return;

        if(depth == list.size())
            list.add(root.val);

        depth++;
        dfs(list, root.right, depth);
        dfs(list, root.left, depth);
    }
}
