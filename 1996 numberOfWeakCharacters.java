class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> {
            if(a[0] != b[0]) return b[0] - a[0];
            return a[1] - b[1];
        });

        int ans = 0;
        int max = -1;

        for(int p[]: properties) {
            if(max > p[1])
                ans++;
            else
                max = p[1];
        }

        return ans;
    }

    
}
