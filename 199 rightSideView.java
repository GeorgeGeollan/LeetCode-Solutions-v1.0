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
class Solution1 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(list, root, 0);

        return list;
    }

    public void dfs(List<Integer> list, TreeNode root, int depth)
    {
        if(root == null)
            return;

        if(depth == list.size())
            list.add(root.val);

        depth++;
        dfs(list, root.right, depth);
        dfs(list, root.left, depth);
    }
}

class Solution2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return list;

        queue.add(root);
        list.add(root.val);

        while(!queue.isEmpty()) {
            int size = queue.size();

            boolean isRight = false;
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if(cur.right != null) {
                    if(!isRight) {
                        list.add(cur.right.val);
                        isRight = true;
                    }
                        

                    queue.add(cur.right);
                }

                if(cur.left != null) {
                    if(!isRight) {
                        list.add(cur.left.val);
                        isRight = true;
                    }

                    queue.add(cur.left);
                }
            }
        }

        return list;
    }
}
