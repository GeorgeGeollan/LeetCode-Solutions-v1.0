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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode buildTree(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
        if(inRight - inLeft < 1) {
            return null;
        }
            

        if(inRight - inLeft == 1)
            return new TreeNode(inorder[inLeft]);

        TreeNode root = new TreeNode(postorder[postRight - 1]);

        int rootIndex = 0;

        for(int i = inLeft; i < inRight; i++)
            if(inorder[i] == root.val)
                rootIndex = i;

        root.left = buildTree(inorder, inLeft, rootIndex, postorder, postLeft, postLeft + rootIndex - inLeft);
        root.right = buildTree(inorder, rootIndex + 1, inRight, postorder, postLeft + rootIndex - inLeft, postRight - 1);

        return root;
    }
}
