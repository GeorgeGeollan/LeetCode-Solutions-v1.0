class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int[] item1: items1) {
            map.put(item1[0],item1[1]);
        }

        for(int[] item2: items2) {
            map.put(item2[0], map.getOrDefault(item2[0], 0) + item2[1]);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> cur = new ArrayList<>();

            cur.add(entry.getKey());
            cur.add(entry.getValue());
            ans.add(cur);
        }

        Collections.sort(ans, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int cmp = o1.get(0).compareTo(o2.get(0)); // 按第一个整数排序
                
                return cmp;
            }
        });

        return ans;
    }
}
