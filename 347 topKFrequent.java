class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                return map.get(a) - map.get(b);
            }
        });

        int count = 0;
        for(int num: nums)
        {
            count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
        }

        for(Integer key: map.keySet())
        {
            if(pq.size() < k)
                pq.add(key);
            
            else if(map.get(key) > map.get(pq.peek()))
            {
                pq.remove();
                pq.add(key);
            }
        }
        
        int i = 0;
        while(!pq.isEmpty())
        {
           res[i] = pq.remove();
           i++;
        }

        return res;

    }
}
