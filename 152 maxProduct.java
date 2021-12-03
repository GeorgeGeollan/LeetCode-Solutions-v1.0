class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;

        for(int n: nums) {
            if(n < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(n * imax, n);
            imin = Math.min(n * imin, n);

            max = Math.max(imax, max);
        }

        return max;
    }
}
