class Solution {
    Set<String> set = new HashSet<>();
    
    public boolean reorderedPowerOf2(int n) {
        init();
        return set.contains(countDigits(n));
    }
    
    public void init() {
        for(int n = 1; n < 1e9; n <<= 1) {
            set.add(countDigits(n));
        }
    }
    
    public String countDigits(int n) {
        char[] cnt = new char[10];
        while(n > 0) {
            ++cnt[n % 10];
            n = n / 10;
        }
        
        return new String(cnt);
    }
}
