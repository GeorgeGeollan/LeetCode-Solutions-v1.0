/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count = 0;
    int ptr = -1;
    public int kthLargest(TreeNode root, int k) {
        inorder(root, k);

        return ptr;
    }

    public void inorder(TreeNode root, int k)
    {
        if(root == null)
            return;

        inorder(root.right, k);
        count++;

        if(count == k)
            ptr = root.val;
        inorder(root.left, k);
    }
}
