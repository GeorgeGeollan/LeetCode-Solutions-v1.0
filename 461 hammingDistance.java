class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;

        for(int i = 0; i < 32; i++) {
            int a = x & 1;
            int b = y & 1;

            if(a != b)
                count++;

            x = x >> 1;
            y = y >> 1;
        }

        return count;
    }
}
