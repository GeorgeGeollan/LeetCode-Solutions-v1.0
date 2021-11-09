class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> map = new HashMap<>();

        for(String word: words) {
            int t = getBin(word);
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for(String puzzle: puzzles) {
            ans.add(getCnt(map, puzzle));
        }

        return ans;
    }

    public int getCnt(Map<Integer, Integer> map, String puzzle) {
        int ans = 0;
        int m = puzzle.length();
        char[] ch = puzzle.toCharArray();
        int first = ch[0] - 'a';

        for(int i = 0; i < (1 << (m - 1)); i++) {

            int u = 1 << first;
            
            for(int j = 1; j < m; j++) {
                if (((i >> (j - 1)) & 1) != 0) 
                    u += 1 << (ch[j] - 'a');
            }

             if(map.containsKey(u))
                ans += map.get(u);
        }
       
        return ans;
    }

    public int getBin(String word) {
        int t = 0;
        char[] ws = word.toCharArray();

        for(char w: ws) {
            int u = w - 'a';
            if((t >> u & 1) == 0)
                t += 1 << u;
        }

        return t;
    }
}
