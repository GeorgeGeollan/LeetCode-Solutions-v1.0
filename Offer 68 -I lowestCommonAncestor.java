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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        
        if(root.val > p.val && root.val < q.val)
            return root;
        
        if(root.val < p.val && root.val > q.val)
            return root;

        if(root.val == p.val || root.val == q.val)
            return root;
        
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);

        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        return null;
    }
}

# improve and concise version for Solution1
class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);

        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }
}

class Solution3 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null)
        {
            if(root.val < p.val && root.val < q.val)
                root = root.right;
            else if(root.val > p.val && root.val > q.val)
                root = root.left;
            else
                break;
        }

        return root;
    }
}
