/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return null;
        StringBuilder sb = new StringBuilder();
        dfs0(root, sb);

        return sb.toString();
    }

    public void dfs0(TreeNode root, StringBuilder sb) {
        if(root == null)
            return;

        sb.append((char) root.val);
        dfs0(root.left, sb);
        dfs0(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null)
            return null;

        TreeNode ans = dfs1(0, data.length() - 1, data);

        return ans;
    }

    public TreeNode dfs1(int l, int r, String data) {
        if(l > r)
            return null;

        int j = l + 1, t = data.charAt(l);
        TreeNode ans = new TreeNode(t);
        while(j <= r && data.charAt(j) <= t)
            j++;

        ans.left = dfs1(l + 1, j - 1, data);
        ans.right = dfs1(j, r, data);

        return ans;

        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
