/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node head, pre;

    public Node treeToDoublyList(Node root) {
        if(root == null)
            return null;

        inorder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        if(pre != null)
            pre.right = root;

        else
            head = root;
        
        root.left = pre;
        pre = root;

        inorder(root.right);
    }
}
