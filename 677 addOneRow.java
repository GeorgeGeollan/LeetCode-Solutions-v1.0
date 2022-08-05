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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode head = new TreeNode(val);
            head.left = root;

            return head;
        }

        Deque<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int level = 1;

        while(!queue.isEmpty()) {
            int size = queue.size();

            while(size-- > 0) {
                TreeNode cur = queue.poll();

                if(level == depth - 1) {
                    TreeNode newRoot = new TreeNode(val);
                    newRoot.left = cur.left;
                    cur.left = newRoot;
                    newRoot = new TreeNode(val);
                    newRoot.right = cur.right;
                    cur.right = newRoot;
                }

                else {
                    if(cur.left != null) {
                        queue.offer(cur.left);
                    }

                    if(cur.right != null)
                        queue.offer(cur.right);
                }
            }

            level++;

            if(level == depth)
                return root;
        }

        return root;


    }
}
