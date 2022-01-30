class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        String[] words = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String word: words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        List<String> ans = new ArrayList<>();

        for(String k: map.keySet()) {
            if(map.get(k) == 1)
                ans.add(k);
        }

        return ans.toArray(new String[ans.size()]);
    }
}
