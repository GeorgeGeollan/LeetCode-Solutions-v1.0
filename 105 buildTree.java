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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length, 0, inorder.length, preorder, inorder);
    }

    public TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if(preStart == preEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = 0;

        for(int i = inStart; i <= inEnd; i++)
            if(inorder[i] == root.val)
            {
                inIndex = i;
                break;
            }

        int leftNum = inIndex - inStart;

        root.left = helper(preStart + 1, preStart + leftNum + 1, inStart, inIndex, preorder, inorder);
        root.right = helper(preStart + leftNum + 1, preEnd, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}
