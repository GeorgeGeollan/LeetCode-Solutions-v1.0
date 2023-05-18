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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) {
            return ans;
        }

        queue.add(root);
        int temp = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            

            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                
                if(temp % 2 == 0) {
                    level.addLast(cur.val);
                }

                else {
                    level.addFirst(cur.val);
                }

                if(cur.left != null) {
                    queue.add(cur.left);
                }

                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }

            temp++;
            ans.add(level);
        }

        return ans;
    }
}
