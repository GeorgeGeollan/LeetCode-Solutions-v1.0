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
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new ArrayList<>();

        dfs(root, target, new ArrayList<>());

        return res;

    }

    public void dfs(TreeNode root, int target, List<Integer> list)
    {
        if(root == null)
            return;

        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            res.add(new ArrayList<>(list));

        dfs(root.left, target, list);
        dfs(root.right, target, list);

        list.remove(list.size() - 1);
    }
}
