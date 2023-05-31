class Solution {
    public int[] constructArr(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        
        if(n == 0) {
            return new int[0];
        }
        
        ans[0] = 1;

        for(int i = 1; i < n; i++) {
            ans[i] = a[i - 1] * ans[i - 1];
        }

        int product = 1;
        for(int i = n - 2; i >= 0; i--) {
            product *= a[i + 1];
            ans[i] = ans[i] * product;
        }

        return ans;
    }
}
