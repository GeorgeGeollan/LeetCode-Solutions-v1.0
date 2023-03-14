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
    int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        
        dfs(root, 1, 0);
        return sum;
    }
    
    public void dfs(TreeNode root, int num, int level) {
        if(root == null) {
            return;
        }
        
        
        if(level == 0) {
            num = num * root.val;
        }
            
        
        else {
            num = num * 10 + root.val;
        }
            
        
        level++;
        if(root != null && root.right == null && root.left == null)
            sum += num;
        
        dfs(root.left, num, level);
        dfs(root.right, num, level);
    }
}


class Solution2 {
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);

        return ans;
    }

    public void dfs(TreeNode node, int prev) {
        if(node == null) {
            return;
        }
        
        prev = prev * 10 + node.val;
        if(node.left == null && node.right == null) {
            ans += prev;
            return;
        }
        
        dfs(node.left, prev);
        dfs(node.right, prev);

    }
}
