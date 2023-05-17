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
    public int[] levelOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) {
            return new int[0];
        }

        queue.add(root);

        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i = 0; i < len; i++) {
                TreeNode cur = queue.poll();

                if(cur.left != null) {
                    queue.add(cur.left);
                }

                if(cur.right != null) {
                    queue.add(cur.right);
                }

                ans.add(cur.val);
            }
        }

        int[] res = new int[ans.size()];

        for(int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
