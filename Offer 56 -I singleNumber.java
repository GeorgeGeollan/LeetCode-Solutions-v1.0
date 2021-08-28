class Solution {
    public int[] singleNumber(int[] nums) {
        int m = 1, n = 0, x = 0, y = 0;

        for(int num: nums)
            n ^= num;

        while((m & n) == 0)
            m <<= 1;
        
        for(int num: nums)
        {
            if((num & m) == 0)
                x ^= num;
            
            else
                y ^= num;
        }

        return new int[]{x, y};

    }
}
