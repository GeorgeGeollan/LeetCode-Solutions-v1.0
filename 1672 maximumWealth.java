class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1;
        int sum = 0;
        for(int[] account: accounts) {
            for(int n: account)
                sum += n;
            
            max = Math.max(max, sum);
            sum = 0;
        }
        
        return max;
    }
}
