class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();

        int[] last = new int[26];

        for(int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < n; i++) {
            int lastIdx = last[s.charAt(i) - 'a'];
            int cnt = 1;
            while(i < lastIdx) {
                lastIdx = Math.max(lastIdx, last[s.charAt(i) - 'a']);
                i++;
                cnt++;
            }

            list.add(cnt);
        }

        return list;
    }
}
