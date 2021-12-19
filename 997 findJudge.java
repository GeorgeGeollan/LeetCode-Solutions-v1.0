class Solution1 {
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

class Solution2 {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        int len = trust.length;

        int judgeIdx = 0;

        for(int i = 0; i < len; i++) {
            outDegree[trust[i][0]]++;
            inDegree[trust[i][1]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(outDegree[i] == 0) {
                judgeIdx = i;
                break;
            }
        }

        if(inDegree[judgeIdx] == n - 1)
            return judgeIdx;

        else
            return -1;
    }
}
