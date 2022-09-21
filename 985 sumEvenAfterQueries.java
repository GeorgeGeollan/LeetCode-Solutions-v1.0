class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        
        for(int num: nums) {
            if((num & 1) == 0)
                sum += num;
        }

        int n = queries.length;

        int[] ans = new int[n];
        int cnt = 0;

        for(int[] query: queries) {
            int idx = query[1];
            int add = query[0];

            int num = nums[idx];
            if((num & 1) == 0) {
                sum -= num;
            }

            num += add;

            if((num & 1) == 0)
                sum += num;

            ans[cnt++] = sum;
            nums[idx] = num;
        }

        return ans;
    }
}
