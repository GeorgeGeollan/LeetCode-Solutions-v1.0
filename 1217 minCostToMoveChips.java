class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int n: position) {
            if(n % 2 == 0)
                odd++;
            
            if(n % 2 == 1)
                even++;
        }

        return Math.min(odd, even);
    }
}
