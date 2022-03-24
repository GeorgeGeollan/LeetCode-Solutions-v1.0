class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];

        int[][] dirs = new int[][] {{0, 0}, {1, 0}, {-1, 0}, {0 , 1}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int sum = 0, cnt = 0;

                for(int[] d: dirs) {
                    int x = d[0] + i, y = d[1] + j;
                    if(x < 0 || x >= m || y < 0 || y >= n)
                        continue;

                    sum += img[x][y];
                    cnt++;
                }

                ans[i][j] = sum / cnt;
            }
        }

        return ans;
    }
}
