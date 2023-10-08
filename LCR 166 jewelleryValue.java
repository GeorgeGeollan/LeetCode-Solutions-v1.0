class Solution {
    public int jewelleryValue(int[][] frame) {
        int m = frame.length, n = frame[0].length;

        for(int i = 1; i < m; i++) {
            frame[i][0] += frame[i - 1][0];
        }

        for(int j = 1; j < n; j++) {
            frame[0][j] += frame[0][j - 1];
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                frame[i][j] += Math.max(frame[i - 1][j], frame[i][j - 1]);
            }
        }

        return frame[m - 1][n - 1];
    }
}
