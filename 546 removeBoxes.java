class Solution {
    public int removeBoxes(int[] boxes) {
        int[][][] dp = new int[boxes.length][boxes.length][boxes.length];

        return calculateMaxPoints(dp, 0, boxes.length - 1, 0, boxes);
    }

    public int calculateMaxPoints(int[][][] dp, int l, int r, int k, int[] boxes)
    {
        if(l > r)
            return 0;
        
        else if(dp[l][r][k] == 0)
        {
            dp[l][r][k] = calculateMaxPoints(dp, l, r - 1, 0, boxes) + (k + 1) * (k + 1);

            for(int i = l; i < r; i++)
            {
                if(boxes[i] == boxes[r])
                    dp[l][r][k] = Math.max(dp[l][r][k], calculateMaxPoints(dp, l, i, k + 1, boxes) + calculateMaxPoints(dp, i + 1, r - 1, 0, boxes));
            }

        }

        return dp[l][r][k];
    }
}
