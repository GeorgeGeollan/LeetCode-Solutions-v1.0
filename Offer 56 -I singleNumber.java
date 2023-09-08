class Solution {
    public int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int start = 0;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer key: map.keySet()) {
            if(map.get(key) == 1) {
                ans[start++] = key;
            }
        }

        return ans;
    }
}
