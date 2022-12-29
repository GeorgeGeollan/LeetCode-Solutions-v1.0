class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] cnt = new int[101];

        for(int n1: nums1) {
            if(cnt[n1] == 1) {
                continue;
            }
            cnt[n1] = cnt[n1] + 1;
        }

        for(int n2: nums2) {
            if(cnt[n2] == 10 || cnt[n2] == 11) {
                continue;
            }
            cnt[n2] += 10;
        }

        for(int n3: nums3) {
            if(cnt[n3] == 101 || cnt[n3] == 110 || cnt[n3] == 111) {
                continue;
            }
            
            cnt[n3] += 100;
        }

        for(int i = 1; i <= 100; i++) {
            System.out.println(cnt[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            if(cnt[i] == 11 || cnt[i] == 101 || cnt[i] == 111 || cnt[i] == 110) {
                ans.add(i);
            }
        }

        return ans;
    }
}
