class Solution {
    public int findComplement(int num) {
        int impr = 1;
        int res = 0;
        while(num >= 1) {
            int bit = 1 - (num & 1);
            res += bit * impr;
            impr <<= 1;
            num >>= 1; 
        }

        return res;
    }
}
