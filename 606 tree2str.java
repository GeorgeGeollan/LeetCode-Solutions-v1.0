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

class Solution2 {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        dfs(root);
        return sb.substring(1, sb.length() - 1);
    }

    public void dfs(TreeNode root) {
        sb.append("(");
        sb.append(root.val);

        if(root.left != null)
            dfs(root.left);

        else if(root.right != null)
            sb.append("()");

        if(root.right != null)
            dfs(root.right);

        sb.append(")");
    }
}
