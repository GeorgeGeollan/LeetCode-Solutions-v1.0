class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 1) {
            res.add(0);
            return res;
        }

        List<List<Integer>> list = new ArrayList<>();
        int[] degree = new int[n];

        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < n; i++)
            if(degree[i] == 1)
                queue.add(i);

        while(!queue.isEmpty()) {
            res = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                res.add(cur);
                List<Integer> neighbors = list.get(cur);

                for(int neighbor: neighbors) {
                    degree[neighbor]--;

                    if(degree[neighbor] == 1)
                        queue.add(neighbor);
                }
            }
        }
        return res;
    }
}
