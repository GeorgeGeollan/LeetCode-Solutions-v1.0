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
    int width = 1;
    ArrayList<Integer> firstId = new ArrayList<>();
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        dfs(root, 1, 0);
        
        return width;
    }
    
    public void dfs(TreeNode root, int id, int depth) {
        if(root == null)
            return;
        
        if(firstId.size() == depth)
            firstId.add(id);
        
        else
            width = Math.max(width, id - firstId.get(depth) + 1);
        
        dfs(root.left, id * 2, depth + 1);
        dfs(root.right, id * 2 + 1, depth + 1);
    }
}
