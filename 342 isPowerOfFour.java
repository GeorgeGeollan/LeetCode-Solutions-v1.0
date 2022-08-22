class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
                return true;
        
        if(n <= 0)
            return false;
        while(n > 1) {
            int mod = n % 4;
            if(mod != 0)
                return false;
            
            n = n / 4;
        }
            
        
        return true;
    }
}
