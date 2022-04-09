class Solution {  
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for(int num: nums) {
            int cnt = map.getOrDefault(num, 0);
            map.put(num, cnt + 1);
        }
        
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
               return map.get(a) - map.get(b);
            }
        });
        
        for(Integer key : map.keySet()) {
            if(pq.size() < k) {
                pq.add(key);
            }
            
            else if(map.get(key) > map.get(pq.peek())) {
                pq.poll();
                pq.add(key);
            }
        }
        
        
        int[] ans = new int[k];
        
        
        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        
        return ans;
    }
}
