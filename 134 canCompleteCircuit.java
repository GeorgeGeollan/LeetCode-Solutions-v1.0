class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;

        int n = gas.length, remain = 0;
        int i = 0, sum = 0;

        for(int j = 0; j < n; j++)
            sum += gas[j] - cost[j];

        if(sum < 0)
            return -1;


        while(i < n) {
            remain = remain + gas[i] - cost[i];
            if(remain < 0) {
                start = i + 1;
                remain = 0;
            }

            i++;
        }

        return start;
    }
}
