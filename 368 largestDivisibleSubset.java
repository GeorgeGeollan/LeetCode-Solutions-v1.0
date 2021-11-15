class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] f = new int[n];
        int[] g = new int[n];

        for(int i = 0; i < n; i++) {
            int len = 1, prev = i;
            for(int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0) {
                    if(f[j] + 1 > len) {
                        len = f[j] + 1;
                        prev = j;
                    }
                }
            }

            f[i] = len;
            g[i] = prev;
        }

        int max = -1, idx = -1;
        for(int i = 0; i < n; i++) {
            if(max < f[i]) {
                max = f[i];
                idx = i;
            }
        }

        List<Integer> list = new ArrayList<>();

        while(list.size() != max) {
            list.add(nums[idx]);
            idx = g[idx];
        }

        return list;
    }
}
