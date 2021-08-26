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
    int[] preorder;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;

        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        TreeNode head = recur(0, 0, preorder.length - 1);

        return head;
    }

    public TreeNode recur(int root, int left, int right)
    {
        if(left > right)
            return null;

        TreeNode head = new TreeNode(preorder[root]);

        int i = map.get(preorder[root]);

        head.left = recur(root + 1, left, i - 1);
        head.right = recur(root + 1 - left + i, i + 1, right);

        return head;
    }
}
