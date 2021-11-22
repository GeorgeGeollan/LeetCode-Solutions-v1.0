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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        if(key > root.val)
            root.right = deleteNode(root.right, key);
        
        else if(key < root.val)
            root.left = deleteNode(root.left, key);

        else
        {
            if(root.left == null)
                return root.right;
            
            else if(root.right == null)
                return root.left;

            root.val = getMin(root.right);
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    public int getMin(TreeNode root)
    {
        while(root.left != null)
            root = root.left;

        return root.val;
    }
}

class Solution2 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        if(root.val < key)
            root.right = deleteNode(root.right, key);
        
        else if(root.val > key)
            root.left = deleteNode(root.left, key);

        else {
            if(root.left == null)
                return root.right;
            
            if(root.right == null)
                return root.left;

            TreeNode tmp = root.left;

            while(tmp.right != null)
                tmp = tmp.right;

            root.val = tmp.val;
            root.left = deleteNode(root.left, tmp.val);
        }

        return root;
    }
}
