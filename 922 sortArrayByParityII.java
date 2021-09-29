class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];

        int c1 = 0;
        int c2 = 1;

        for(int num : nums)
        {
            if(num % 2 == 0 && c1 < nums.length)
            {
                res[c1] = num;
                c1 += 2;
            }

            if(num % 2 == 1)
            {
                res[c2] = num;
                c2 += 2;
            }
        }

        return res;
    }
}
