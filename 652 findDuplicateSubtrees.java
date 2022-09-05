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
    Set<TreeNode> repeat = new HashSet<>();
    Map<String, TreeNode> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);

        return new ArrayList<TreeNode>(repeat);
    }

    public String dfs(TreeNode node) {
        if(node == null)
            return "";

        StringBuilder sb = new StringBuilder();
        sb.append(node.val);
        sb.append("(");
        sb.append(dfs(node.left));
        sb.append(")(");
        sb.append(dfs(node.right));
        sb.append(")");

        String serial = sb.toString();
        if(map.containsKey(serial)) {
            repeat.add(map.get(serial));
        }

        else {
            map.put(serial, node);
        }

        return serial;
        
    }
}
