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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(original);
        q2.add(cloned);

        while(!q1.isEmpty()) {
            int size = q1.size();

            for(int i = 0; i < size; i++) {
                TreeNode cur1 = q1.poll();
                TreeNode cur2 = q2.poll();

                if(cur1 == target)
                    return cur2;

                if(cur1.left != null) {
                    q1.add(cur1.left);
                    q2.add(cur2.left);
                }

                if(cur1.right != null) {
                    q1.add(cur1.right);
                    q2.add(cur2.right);
                }
            }
        }

        return null;
    }
}
