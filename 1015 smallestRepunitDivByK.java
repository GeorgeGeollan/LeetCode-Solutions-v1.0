class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0)
            return -1;

        int temp = 1;
        int len = 1;

        while(temp % k != 0) {
            temp = temp % k;
            temp = temp * 10 + 1;
            len++;
        }

        return len;
    }
}
