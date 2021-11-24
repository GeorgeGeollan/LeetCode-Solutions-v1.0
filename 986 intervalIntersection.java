class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int m = firstList.length;
        int n = secondList.length;
        if(m == 0 || n == 0)
            return new int[0][0];

        int i = 0, j = 0;

        while(i < m && j < n) {
            int x = Math.max(firstList[i][0], secondList[j][0]);
            int y = Math.min(firstList[i][1], secondList[j][1]);

            if(x <= y)
                list.add(new int[] {x, y});

            if(firstList[i][1] > secondList[j][1])
                j++;

            else if(firstList[i][1] <= secondList[j][1])
                i++;
        }

        if(list.size() == 0)
            return new int[0][0];


        int[][] res = new int[list.size()][list.get(0).length];

        for(int k = 0; k < list.size(); k++)
            res[k] = list.get(k);

        return res;
    }
}
