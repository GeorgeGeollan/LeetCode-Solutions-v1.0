class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for(int num: nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(int num: nums) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int cnt1 = cnt.get(a), cnt2 = cnt.get(b);
            return cnt1 != cnt2 ? cnt1 - cnt2 : b - a;
        });

        int len = nums.length;

        for(int i = 0; i < len; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}
