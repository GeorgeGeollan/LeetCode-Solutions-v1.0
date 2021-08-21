class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1)
            return 1;
        int[] judge = new int[n + 1];

        for(int t[]: trust)
        {
            judge[t[1]]++;
            judge[t[0]]--;
        }

        for(int i = 0; i < judge.length; i++)
            if(judge[i] == n - 1)
                return i;


        return -1;
    }
}
