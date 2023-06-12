class Solution {
    int ans = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        ans += n;
        return ans;
    }
}
