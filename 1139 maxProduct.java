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
    long max = 0;
    public int maxProduct(TreeNode root) {
        long treeSum = findSum(root);

        long treeMax = findMax(root, treeSum);

        return (int)(max % 1000000007);

    }

    public long findSum(TreeNode root)
    {
        if(root == null)
            return 0;

        long left = findSum(root.left);
        long right = findSum(root.right);

        return left + right + root.val; 
    }

    public long findMax(TreeNode root, long treeSum)
    {
        if(root == null)
            return 0;

        long left = findMax(root.left, treeSum);
        long right = findMax(root.right, treeSum);

        long cur = left + right + root.val;
        max = Math.max(max, cur * (treeSum - cur));

        return cur;
    }
}
