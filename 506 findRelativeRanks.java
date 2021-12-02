class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] medal = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int n = score.length;
        String[] ans = new String[n];
        int[] clone = score.clone();
        Arrays.sort(clone);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)
            map.put(clone[i], n - i);

        for(int i = 0; i < n; i++) {
            int val = map.get(score[i]);
            System.out.println(val);
            ans[i] = val <= 3 ? medal[val - 1] : "" + val;
        }

        return ans;
    }
}
