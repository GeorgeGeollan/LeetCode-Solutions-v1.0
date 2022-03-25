class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int[] temp = new int[n];
        int ans = 0;

       
       for(int i = 0; i < n; i++) {
           ans += costs[i][0];
           temp[i] = costs[i][1] - costs[i][0];
       }

       Arrays.sort(temp);

       for(int i = 0; i < n / 2; i++) {
           ans += temp[i];
       }

       return ans;
    }
}
