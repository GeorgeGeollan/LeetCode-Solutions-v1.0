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
    public List<TreeNode> generateTrees(int n) {
        return genTrees(1, n);
    }

    public List<TreeNode> genTrees(int start, int end)
    {
        List<TreeNode> list = new ArrayList<>();

        if(start > end)
        {
            list.add(null);
            return list;
        }

        if(start == end)
        {
            list.add(new TreeNode(start));
            return list;
        }

        List<TreeNode> left, right;

        for(int i = start; i <= end; i++)
        {
            left = genTrees(start, i - 1);
            right = genTrees(i + 1, end);

            for(TreeNode l: left)
            {
                for(TreeNode r: right)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }

        return list;
    }
}
