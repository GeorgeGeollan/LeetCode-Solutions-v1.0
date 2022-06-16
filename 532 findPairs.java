class Solution1 {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> diff = new HashSet<>();

        for(int num: nums) {
            if(seen.contains(num - k))
                diff.add(num - k);

            if(seen.contains(num + k))
                diff.add(num);

            seen.add(num);
        }

        return diff.size();
    }
}

class Solution2 {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> target = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int num: nums) {
            target.add(num + k);
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: nums) {
            if(target.contains(num)) {
                if(!set.contains(num) || map.get(num) >= 2) {
                    ans++;
                    set.add(num);
                }
            }
        }

        return ans;
    }
}
