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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode cur = new TreeNode(val);
            cur.left = root;
            return cur;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int curd = 1;
        
        while(!q.isEmpty()) {
            int size = q.size();
           
            curd++;
            for(int i = 0; i < size; i++) {
                TreeNode cur = q.poll(); 
                if(curd == depth) {
                    System.out.println(cur.val);
                    
                    TreeNode tmpl = cur.left;
                    cur.left = new TreeNode(val);
                    cur.left.left = tmpl;


                    TreeNode tmpr = cur.right;
                    cur.right = new TreeNode(val);
                    cur.right.right = tmpr;
                }

                else {
                    if(cur.left != null)
                        q.add(cur.left);
                    
                    if(cur.right != null)
                        q.add(cur.right);
                }
            }
        }

        return root;
    }
}
