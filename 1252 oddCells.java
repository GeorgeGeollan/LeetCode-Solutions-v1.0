class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int rows = 0, cols = 0;
        int[][] ans = new int[m][n];
        int cnt = 0;

        for(int[] indice: indices) {
            for(int i = 0; i < n; i++) {
                ans[indice[0]][i]++;
            }

            for(int i = 0; i < m; i++) {
                ans[i][indice[1]]++;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(ans[i][j] % 2 == 1)
                    cnt++;
            }
        }

        return cnt;
    }
}
