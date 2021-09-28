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
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode cur = queue.poll();
            dfs(cur, targetSum, 0);
            

            if(cur.left != null)
                queue.add(cur.left);

            if(cur.right != null)
                queue.add(cur.right);
        }

        return count;
    }

    public void dfs(TreeNode root, int targetSum, int sum)
    {
        if(root == null)
            return;
        sum = sum + root.val;

        if(sum == targetSum)
            count++;

        dfs(root.left, targetSum, sum);
        dfs(root.right, targetSum, sum);
    }
}
