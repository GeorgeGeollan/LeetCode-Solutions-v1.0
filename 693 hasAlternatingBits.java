class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n % 2;
        n = n / 2;

        while(n > 0) {
            int cur = n % 2;
            n = n / 2;
            if(prev == cur)
                return false;
            
            prev = cur;
        }

        return true;
    }
}
