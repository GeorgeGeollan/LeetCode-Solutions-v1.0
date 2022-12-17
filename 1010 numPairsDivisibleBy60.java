class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int ans = 0;
        
        for(int t: time)
            count[t % 60]++;
        
        for(int i = 0; i <= 30; i++) {
            if(i == 0 || i == 30) {
                int cur = count[i];
                ans += cur * (cur - 1) / 2;
            }
            
            else {
                ans += count[i] * count[60 - i];
            }
                
        }
        
        return ans;
    }
}
