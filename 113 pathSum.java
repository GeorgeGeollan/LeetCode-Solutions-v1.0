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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        preorder(root, targetSum, 0, new ArrayList<>());

        return res;
    }

    public void preorder(TreeNode root, int targetSum, int sum, List<Integer> temp)
    {
        if(root == null)
            return;

        temp.add(root.val);
        sum += root.val;

        if(targetSum == sum && root.left == null && root.right == null)
            res.add(new ArrayList<>(temp));

        preorder(root.left, targetSum, sum, temp);
        preorder(root.right, targetSum, sum, temp);
        temp.remove(temp.size() - 1);
    }
}
