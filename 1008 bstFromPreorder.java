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
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length - 1);
    }

    public TreeNode build(int[] preorder, int left, int right) {
        if(left > right)
            return null;

        TreeNode node = new TreeNode(preorder[left]);
        int k = left + 1;

        while(k <= right) {
            if(preorder[k] > preorder[left])
                break;

            k++;
        }

        node.left = build(preorder, left + 1, k - 1);
        node.right = build(preorder, k, right);

        return node;
    }
}
