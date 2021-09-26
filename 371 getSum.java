class Solution {
    public int getSum(int a, int b) {
        int res = 0;
        int add = 0;

        for(int i = 0; i < 32; i++)
        {
            int bita = a & 1;
            int bitb = b & 1;

            int cur = (bita + bitb + add) % 2;
            add = (bita + bitb + add) / 2;
            res = res | (cur << i);
            a = a >> 1;
            b = b >> 1;
        }

        return res;
    }
}
