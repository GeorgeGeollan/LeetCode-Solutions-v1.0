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
        if(root == null)
            return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode ptr = queue.poll();
            list.add(ptr.val);

            if(ptr.left != null)
                queue.add(ptr.left);
            
            if(ptr.right != null)
                queue.add(ptr.right);
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }
}
