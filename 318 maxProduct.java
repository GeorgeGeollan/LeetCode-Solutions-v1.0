class Solution {
    public int maxProduct(String[] words) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(String word: words) {
            int val = 0, len = word.length();
            for(char ch: word.toCharArray()) {
                val |= 1 << (ch - 'a');
            }

            if(!map.containsKey(val) || map.get(val) < len)
                map.put(val, len);
        }

        int maxP = 0;

        for(int a: map.keySet()) {
            for(int b : map.keySet()) {
                if((a & b) == 0)
                    maxP = Math.max(maxP, map.get(a) * map.get(b));
            }
        }

        return maxP;
    }
}
