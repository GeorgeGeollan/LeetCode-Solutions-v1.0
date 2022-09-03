class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));

        int min = Integer.MIN_VALUE;
        int ans = 0;

        for(int[] pair: pairs) {
            if(pair[0] > min) {
                ans++;
                min = pair[1];
            }
        }

        return ans;
    }
}
