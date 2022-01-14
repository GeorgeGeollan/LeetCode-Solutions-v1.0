class Solution {
    boolean flag = true;
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums1.length, m = nums2.length;

        if(n > m && flag == true)
            kSmallestPairs(nums2, nums1, k);

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->(nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));

        for(int i = 0; i < Math.min(n, k); i++)
            q.add(new int[] {i, 0});

        while(ans.size() < k && !q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0], b = poll[1];
            ans.add(new ArrayList<>(){{
                add(flag ? nums1[a] : nums2[b]);
                add(flag ? nums2[b] : nums1[a]);
            }});

            if(b + 1 < m)
                q.add(new int[] {a, b + 1});
        }

        return ans;
    }
}
