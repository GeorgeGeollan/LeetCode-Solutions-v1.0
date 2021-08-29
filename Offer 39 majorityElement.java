class Solution1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num: nums)
        {
            int count = map.getOrDefault(num, 0);
            count++;

            map.put(num, count);

            if(count > n / 2)
                return num;
        }

        return -1;
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        int count = 0, x = 0;

        for(int num: nums)
        {
            if(count == 0)
                x = num;

            count += num == x ? 1 : -1;
        }

        return x;
    }
}
