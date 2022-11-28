class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        int max = 0;

        for(int[] match: matches) {
            max = Math.max(match[0], max);
            max = Math.max(match[1], max);
        }

        int[] inDegree = new int[max + 1];
        int[] outDegree = new int[max + 1];

        for(int[] match: matches) {
            inDegree[match[0]]++;
            outDegree[match[1]]++;
        }

        for(int i = 0; i <= max; i++) {
            if(inDegree[i] >= 1 && outDegree[i] == 0) {
                ans.get(0).add(i);
            }

            else if(outDegree[i] == 1) {
                ans.get(1).add(i);
            }
        }

        return ans;
    }
}
