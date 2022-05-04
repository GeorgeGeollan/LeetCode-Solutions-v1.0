class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(int num : nums) {
            int cnt = map.getOrDefault(num, 0);
            map.put(num, cnt + 1);
        }

        for(int num : nums) {
            int ans = k - num;
            System.out.println(ans);
            int cnt1 = map.getOrDefault(num, 0);

            int cnt2 = map.getOrDefault(ans, 0);
            if(ans == num)
                cnt2 = cnt2 - 1;

            System.out.println(ans + " " + cnt1 + " " + cnt2);

            if(cnt2 > 0) {
                if(ans == num) {
                    map.put(ans, cnt1 - 2);
                    max++;
                }

                else {
                    int cut = Math.min(cnt1, cnt2);
                    map.put(ans, cnt2 - cut);
                    map.put(num, cnt1 - cut);
                    max += cut;
                }
               
            }
        }

        return max;
    }
}
