/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        levelOrderDFS(root, res, 0);

        return res;
    }

    public void levelOrderDFS(TreeNode root, List<List<Integer>> res, int level)
    {
        if(root == null)
            return;
        
        if(res.size() <= level)
            res.add(new ArrayList<>());

        if(level % 2 == 0)
            res.get(level).add(root.val);

        else
            res.get(level).add(0, root.val);

        levelOrderDFS(root.left, res, level + 1);
        levelOrderDFS(root.right, res, level + 1);

    }
}

class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null)
            queue.add(root);

        while(!queue.isEmpty())
        {
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--)
            {
                TreeNode tmp = queue.poll();

                if(res.size() % 2 == 0)
                    list.addLast(tmp.val);
                
                else
                    list.addFirst(tmp.val);
                
                if(tmp.left != null)
                    queue.add(tmp.left);
                
                if(tmp.right != null)
                    queue.add(tmp.right);
            }

            res.add(list);
        }

        return res;
    }
}
