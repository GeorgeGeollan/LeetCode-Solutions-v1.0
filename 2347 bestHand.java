class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> set = new HashSet<>();
        
        for(char suit: suits) {
            set.add(suit);
        }

        if(set.size() == 1) {
            return "Flush";
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int rank: ranks) {
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }

        if(map.size() == 5) {
            return "High Card";
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 2) {
                return "Three of a Kind";
            }
        }

        return "Pair";
    }
}
