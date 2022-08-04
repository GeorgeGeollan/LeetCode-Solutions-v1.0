class Solution {
    public int mirrorReflection(int p, int q) {
        while((q & 1) == 0 && (p & 1) == 0) {
            q >>= 1;
            p >>= 1;
        }
        
        if((p & 1) == 0)
            return 2;
        
        if((q & 1) == 0)
            return 0;
        
        return 1;
    }
}
