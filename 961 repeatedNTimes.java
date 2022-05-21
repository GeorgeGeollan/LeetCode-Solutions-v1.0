class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums) {
            int cnt = map.getOrDefault(num, 0) + 1;

            if(cnt > 1)
                return num;
            map.put(num, cnt);

        }

        return -1;
    }
}
