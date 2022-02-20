class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;

        for(int i = 0; i < n;) {
            if(i + 1 == n - 1 && bits[i] == 1)
                return false;

            if(bits[i] == 1) {
                i = i + 2;
                continue;
            }

            if(bits[i] == 0) {
                i = i + 1;
                continue;
            }
            
        }

        return true;
    }
}
