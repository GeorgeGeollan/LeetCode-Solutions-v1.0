class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len = s.length();

        int[] parent = new int[len];

        for(int i = 0; i < len; i++) {
            parent[i] = i;
        }

        for(List<Integer> pair: pairs) {
            int ance0 = find(pair.get(0), parent);
            int ance1 = find(pair.get(1), parent);

            parent[ance1] = ance0;
        } 

        Map<Integer, Queue<Character>> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            int ance = find(i, parent);
            map.computeIfAbsent(ance, k -> new PriorityQueue<>()).offer(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            Queue queue = map.get(find(i, parent));
            sb.append(queue.poll());
        }

        return sb.toString();
    }

    public int find(int i, int[] parent) {
        if(parent[i] != i)
            parent[i] = find(parent[i], parent);

        return parent[i];
    }
}
