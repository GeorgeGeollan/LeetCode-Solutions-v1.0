class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] temp = new int[heights.length];

        for(int i = 0; i < n; i++) {
            temp[i] = heights[i];
        }

        Arrays.sort(temp);
        int ans = 0;

        for(int i = 0; i < n; i++) {
            if(heights[i] != temp[i])
                ans++;
        }

        return ans;
    }
}
