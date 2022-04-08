/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution1 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        leveldfs(root, list, 0);
        
        return list;
    }

    public void leveldfs(Node root, List<List<Integer>> list, int level)
    {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return;

        if(list.size() <= level)
            list.add(new ArrayList<>(res));

        list.get(level).add(root.val);

        for(Node n: root.children)
            leveldfs(n, list, level + 1);
    }
}

class Solution2 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        List<Integer> first = new ArrayList<>();
        first.add(root.val);
        ans.add(first);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                Node cur = queue.poll();

                for(Node n: cur.children) {
                    level.add(n.val);
                    queue.add(n);
                }
            }

            if(level.size() > 0)
                ans.add(level);
        }

        return ans;
    }
}
