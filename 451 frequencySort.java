class Solution {
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
