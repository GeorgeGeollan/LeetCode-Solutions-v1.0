class Solution1 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums)
        {
            int count = map.getOrDefault(num, 0);
            count++;

            map.put(num, count);
        }

        for(int num: nums)
            if(map.get(num) == 1)
                return num;

        return -1;
    }
}
