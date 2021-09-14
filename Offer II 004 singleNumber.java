class Solution1 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int count = 0;
            count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }
}

class Solution2 {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];

        for(int num : nums)
        {
            for(int i = 0; i < 32; i++)
            {
                count[i] += num & 1;
                num >>>= 1;
            }
        }

        int res = 0, m = 3;

        for(int i = 0; i < 32; i++)
        {
            res <<= 1;
            res |= count[31 - i] % m;
        }

        return res;
    }
}
