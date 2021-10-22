class Solution1 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] words = s.toCharArray();
        String res = "";

        for(char word: words)
        {
            int count = map.getOrDefault(word, 0);
            count++;
            map.put(word, count);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));
        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty())
        {
            char cur = pq.poll();

            for(int i = 0; i < map.get(cur); i++)
                sb.append(cur);
        }

        return sb.toString();

    }
}

class Solution2 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char letter: s.toCharArray())
            map.put(letter, map.getOrDefault(letter, 0) + 1);

        List<Character>[] buckets = new List[s.length() + 1];

        for(char key: map.keySet()) {
            int value = map.get(key);

            if(buckets[value] == null)
                buckets[value] = new ArrayList<Character>();

            buckets[value].add(key);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = buckets.length - 1; i > 0; i--) {
            if(buckets[i] != null) {
                for(char letter: buckets[i]) {
                    for(int j = i; j > 0; j--)
                        sb.append(letter);
                }
            }
        }

        return sb.toString();
    }
}
