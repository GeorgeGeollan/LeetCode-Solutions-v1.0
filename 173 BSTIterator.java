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
class BSTIterator1 {
    TreeNode cur;
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        cur = root;
        stack = new Stack<>();
    }
    
    public int next() {
        while(cur != null) {
            stack.push(cur);
            cur = cur.left;
        }

        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }
    
    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}

class BSTIterator2 {
    Deque<TreeNode> d = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        dfsLeft(root);   
    }
    
    public int next() {
        TreeNode root = d.pollLast();
        int ans = root.val;
        root = root.right;
        dfsLeft(root);

        return ans;
    }
    
    public boolean hasNext() {
        return !d.isEmpty();
    }

    public void dfsLeft(TreeNode root) {
        while(root != null) {
            d.addLast(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
