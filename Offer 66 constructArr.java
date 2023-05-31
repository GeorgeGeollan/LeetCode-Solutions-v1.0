class Solution {
    public int[] constructArr(int[] a) {
        int[] ans = new int[a.length];
        Arrays.fill(ans, 1);

        for(int i = 1; i < a.length; i++) {
            ans[i] = a[i - 1] * ans[i - 1];
        }

        int product = 1;
        for(int i = a.length - 2; i >= 0; i--) {
            product *= a[i + 1];
            ans[i] = ans[i] * product;
        }
        
        return ans;
    }
}
