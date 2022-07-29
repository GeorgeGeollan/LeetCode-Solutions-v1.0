class Solution1 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        boolean same = true;

        for(String word: words) {
            map = new HashMap<>();
            map2 = new HashMap<>();
            for(int i = 0; i < word.length(); i++) {
                System.out.println(i);
                if(map.containsKey(pattern.charAt(i))) {
                    if(map.get(pattern.charAt(i)) != word.charAt(i))
                        break;
                }

                else
                    map.put(pattern.charAt(i), word.charAt(i));
                if(map2.containsKey(word.charAt(i))) {
                    if(map2.get(word.charAt(i)) != pattern.charAt(i))
                        break;
                }
                else
                    map2.put(word.charAt(i), pattern.charAt(i));

                System.out.println(word);

                if(i == word.length() - 1)
                    list.add(word);
            }
        }

        return list;
    }
}

class Solution2 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        int[] map = new int[26], vis = new int[26];
        
        for(String word: words) {
            Arrays.fill(map, -1);
            Arrays.fill(vis, 0);
            boolean ok = true;

            for(int i = 0; i < pattern.length() && ok; i++) {
                int c1 = word.charAt(i) - 'a', c2 = pattern.charAt(i) - 'a';

                if(map[c1] == -1 && vis[c2] == 0) {
                    map[c1] = c2;
                    vis[c2] = 1;
                }

                else if(map[c1] != c2)
                    ok = false;
            }

            if(ok)
                ans.add(word);
        }

        return ans;
    }
}
