class Solution {
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

