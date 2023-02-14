class Solution {
    public int longestWPI(int[] hours) {
        int ans = 0, s = 0, n = hours.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            s += hours[i] > 8 ? 1 : -1;

            if(s > 0) {
                ans = i + 1;
            }

            else if(map.containsKey(s - 1)) {
                ans = Math.max(ans, i - map.get(s - 1));
            }

            map.putIfAbsent(s, i);
        }

        return ans;
    }
}
