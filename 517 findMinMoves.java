class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        int n = machines.length;
        for(int machine: machines)
            sum += machine;

        if(sum % n != 0)
            return -1;

        int avg = sum / n;
        int ls = 0, rs = sum;
        int max = 0;

        for(int i = 0; i < machines.length; i++)
        {
            rs -= machines[i];

            int a = Math.max(i * avg - ls, 0);
            int b = Math.max((n - i - 1) * avg - rs, 0);

            ls += machines[i];
            max = Math.max(a + b, max);
        }

        return max;
        
    }
}
