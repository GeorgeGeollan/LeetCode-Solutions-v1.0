class Solution {
    public int[] printNumbers(int n) {
        int length = (int)Math.pow(10, n);

        int[] arr = new int[length - 1];

        for(int i = 0; i < length - 1; i++)
            arr[i] = i + 1;

        return arr;
    }
}
