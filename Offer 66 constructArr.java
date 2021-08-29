class Solution {
    public int[] constructArr(int[] a) {
        int n = a.length;

        if(n == 0)
            return new int[0];

        int temp = 1;
        int[] B = new int[n];
        B[0] = 1;

        for(int i = 1; i < n; i++)
            B[i] = B[i - 1] * a[i - 1];

        for(int i = n - 1; i >= 1; i--)
        {
            temp *= a[i];
            B[i - 1] *= temp;
        }

        return B;
    }
}
