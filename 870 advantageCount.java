class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        TreeSet<Integer> tset = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums1) {
            int cnt = map.getOrDefault(num, 0);
            map.put(num, cnt + 1);

            if(map.get(num) == 1)
                tset.add(num);
        }

        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++) {
            Integer cur = tset.ceiling(nums2[i] + 1);

            if(cur == null)
                cur = tset.ceiling(-1);
            
            ans[i] = cur;

            map.put(cur, map.get(cur) - 1);

            if(map.get(cur) == 0)
                tset.remove(cur);
        }

        return ans;
    }
}
