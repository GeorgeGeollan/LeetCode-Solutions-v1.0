/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
            return root;

        LinkedList<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            Node tmp = queue.get(0);

            for(int i = 1; i < size; i++) {
                tmp.next = queue.get(i);
                tmp = queue.get(i);
            }

            for(int i = 0; i < size; i++) {
                Node cur = queue.remove();

                if(cur.left != null)
                    queue.add(cur.left);

                if(cur.right != null)
                    queue.add(cur.right);
            }
        }

        return root;
    }
}
