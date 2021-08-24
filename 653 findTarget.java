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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();

        return dfs(root, set, k);
    }

    public boolean dfs(TreeNode root, HashSet<Integer> set, int k)
    {
        if(root == null)
            return false;

        if(set.contains(k - root.val))
            return true;

        set.add(root.val);

        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }
}

class Solution2 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        for(int i = 0, j = list.size() - 1; i < j;)
        {
            if(list.get(i) + list.get(j) == k)
                return true;
            
            else if(list.get(i) + list.get(j) > k)
                j--;
            
            else
                i++;
        }

        return false;

    }

    public void inorder(TreeNode root, List<Integer> list)
    {
        if(root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
