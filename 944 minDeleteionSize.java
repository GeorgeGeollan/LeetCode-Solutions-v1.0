class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int ans = 0;

        for(int i = 0; i < n; i++) {
            char prev = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(prev > strs[j].charAt(i)) {
                    ans++;
                    break;
                }

                prev = strs[j].charAt(i);
            }
        }

        return ans;
    }
}
