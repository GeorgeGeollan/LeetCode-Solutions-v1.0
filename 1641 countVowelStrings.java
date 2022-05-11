class Solution {
    public int countVowelStrings(int n) {
        if(n == 1)
            return 5;
        int a = 1, b = 1, c = 1, d = 1, e = 1;
        for(int i = 3; i <= n; i++){
            e += a + b + c + d;
            d += a + b + c;
            c += a + b;
            b += a;
        }
        
        return 5 * a + 4 * b + 3 * c + 2 * d + 1 * e;
        
    }
}
