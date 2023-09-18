class Solution1 {
    // 根据间隔的个数来判断，间隔全部为1则正常，不全唯一，统计零的个数和间隔的长度
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0, prev = nums[0], ans = 0;
        for(int num: nums) {
            if(num != 0) {
                break;
            }

            cnt++;
        }

        if(cnt == 5) {
            return true;
        }

        prev = nums[cnt];

        for(int i = cnt + 1; i < nums.length; i++) {
            System.out.println(prev + " " + nums[i]);
            if(nums[i] - prev >= 1) {
                ans += (nums[i] - prev - 1);
            }

            if(nums[i] - prev == 0) {
                return false;
            }

            prev = nums[i];
        }

        

        return cnt >= ans;
    }
}

class Solution2 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for(int num: nums) {
            if(num == 0) {
                continue;
            }

            if(set.contains(num)) {
                return false;
            }

            max = Math.max(max, num);
            min = Math.min(min, num);
            set.add(num);
        }

        return max - min < 5;
    }
}
