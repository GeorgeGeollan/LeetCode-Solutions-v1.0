class Solution {
    public int maxProduct(String[] words) {
        Map<Integer, Integer> map  = new HashMap<>();
        
        for(String word: words) {
            int t = 0;
            int m = word.length();
            
            for(int i = 0; i < m; i++) {
                int u = word.charAt(i) - 'a';
                t |= (1 << u);
            }
            
            if(!map.containsKey(t) || map.get(t) < m)
                map.put(t, m);
        }
        
        int ans = 0;
        for(int a: map.keySet()) {
            for(int b: map.keySet()) {
                if((a & b) == 0)
                    ans = Math.max(ans, map.get(a) * map.get(b));
            }
        }
        
        return ans;
    }
}
