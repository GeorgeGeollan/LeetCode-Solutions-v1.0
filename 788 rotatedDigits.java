class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;

        for(int i = 1; i <= n; i++) {
            String cur = "" + i;
            System.out.println(cur);
            if(cur.contains("3") || cur.contains("4") || cur.contains("7"))
                continue;

            else if(cur.contains("2") || cur.contains("5") || cur.contains("6") || cur.contains("9"))
                ans++;
        }

        return ans;
    }
}
